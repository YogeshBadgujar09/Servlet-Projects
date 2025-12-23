package com.yogesh.model;

public class UserModel {
	
	private int userId ;
	private String name;
	private String email;
	private String mobile ;
	private String gender ;
	private String discription ;
	private String password ;
	
	public String getGender() {	return gender; }
	public void setGender(String gender) {	this.gender = gender; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getMobile() {	return mobile; }
	public void setMobile(String mobile) { this.mobile = mobile; }
	
	public String getDiscription() { return discription; }
	public void setDiscription(String discription) { this.discription = discription; }
	
	public String getPassword() { return password; }
	
	public void setPassword(String password) { this.password = password; }
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", discriptionString=" + discription + ", password=" + password + "]";
	}

}
