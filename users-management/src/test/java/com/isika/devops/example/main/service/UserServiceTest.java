package com.isika.devops.example.main.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.isika.devops.example.main.model.User;

public class UserServiceTest {

	@Test
	public void shouldReturnValidUserObjectWhenCreatedWithParameters() {
		
		// Créer une instance du service users, et appeler la méthode create avec les params nécessaires
		UserService serviceUnderTest = new UserService();
		
		// Préparer les params d'appel
		String firstName = "Med";
		String lastName = "BH";
		String email = "med@bh.com";
		
		// Début du test
		
		// 1 - Appel au code fonctionnel (comportement = creation d'un user avec params)
		User userCreated = serviceUnderTest.create(firstName, lastName, email);
		
		// 2 - Validation (Assertions)
		assertNotNull(userCreated);
		
		assertEquals(firstName, userCreated.getFirstName());
		assertEquals(lastName, userCreated.getLastName());
		assertEquals(email, userCreated.getEmail());
	}

}
