package com.isika.devops.example.main.service;

import com.isika.devops.example.main.model.User;

public class UserService {

	public User create(String firstName, String lastName, String email) {
		return new User(firstName, lastName, email);
	}
	
}
