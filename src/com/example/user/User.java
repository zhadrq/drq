package com.example.user;

public class User {
	/*
 {"id":1001,
 "name":"уе╥и",
 "avatar":"avatar/zhangfei.jpg",
 "password":"1234",
 "phone":"68357788",
 "email":"zhangfei@qq.com"
 }
	 */
	private int id ;
	private String name;
	private String password;
	private String avatar;
	private String phone;
	private String email;
	public User() {
		
	}
	User(int id,String name , String passoword,String avatar,String phone , String email)
	{
		this.id = id;
		this.avatar = avatar;
		this.email = email;
		this.phone = phone;
		this.password=passoword;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", avatar=" + avatar + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
	
}
