package test.druid.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import test.druid.mybatis.domain.User;

public interface UserDao {
	void save(User user);
	void update(User user);
	User getByAccount(String account);
	User login(@Param("account") String account, @Param("password") String password);
}