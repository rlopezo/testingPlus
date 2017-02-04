package com.testingplus.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1411374035003265161L;
	
	private Integer id;
	private String userName;
	private String userPassword;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	


}
