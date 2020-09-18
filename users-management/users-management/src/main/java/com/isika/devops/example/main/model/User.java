package com.isika.devops.example.main.model;

import java.time.LocalDate;

public class User {

	private String email;
	private String firstName;
	private String lastName;
	private LocalDate registerDate; 
	
	public User() {
	}
	
	public User(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.registerDate = LocalDate.now();
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getRegisterDate() {
		return registerDate;
	}
}
