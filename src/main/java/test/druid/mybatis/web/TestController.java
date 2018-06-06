package test.druid.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.druid.mybatis.domain.User;
import test.druid.mybatis.service.UserService;

@RestController
public class TestController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "/login" })
	public User login(String account, String password) {
		return userService.login(account, password);
	}

	@RequestMapping(value = { "/register" })
	public User register(String account, String password, String userName) {
		return userService.register(account, password, userName);
	}

	@RequestMapping(value = { "/changeName" })
	public User changeName(String account, String userName) {
		return userService.changeName(account, userName);
	}
}
