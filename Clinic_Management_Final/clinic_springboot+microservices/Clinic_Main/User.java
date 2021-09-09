package com.ust.springboot;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
	
	
private	long id;
	
private String uname;
	
private String password;
	
private String role;
	
	
	public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
