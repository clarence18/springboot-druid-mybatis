package test.druid.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.druid.mybatis.dao.UserDao;
import test.druid.mybatis.domain.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public User login(String account, String password) {
		User user = userDao.login(account, password);
		return user;
	}

	public User register(String account, String password, String userName) {
		User user = userDao.getByAccount(account);
		if(user==null) {
			synchronized (this) {
				user = new User();
				user.setAccount(account);
				user.setPassword(password);
				user.setUserName(userName);
				userDao.save(user);
			}
			return user;
		} else {
			return null;
		}
	}

	public User changeName(String account, String userName) {
		User user = userDao.getByAccount(account);
		if(user!=null) {
			user.setUserName(userName);
			userDao.update(user);

			return user;
		} else {
			return null;
		}
	}
}
