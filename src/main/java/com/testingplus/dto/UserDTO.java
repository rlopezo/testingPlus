package com.testingplus.dto;

import java.util.List;

import com.testingplus.model.User;

public class UserDTO {
	
	private User user;
	private List<User> usersList;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<User> getUsersList() {
		return usersList;
	}
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
	
}
