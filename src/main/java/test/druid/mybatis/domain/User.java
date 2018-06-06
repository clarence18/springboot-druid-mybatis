package test.druid.mybatis.domain;

public class User {

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String account;
	private String password;
	private String userName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User "+ 
				"[userId=" + userId +
				", account=" + account + 
				", password=" + password + 
				", userName=" + userName + 
		"]";
	}

}