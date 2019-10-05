package edu201909.day2;

public class Userinfo {

	public Userinfo() {
		
	}
	
	public Userinfo(Integer userId,String userName,Integer age) {
		this.userId = userId;
		this.userName = userName;
		this.age = age;
	}
	
	private Integer userId;
	private String userName;
	private Integer age;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Userinfo [userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}
}
