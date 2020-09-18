package com.isika.cdi6.candidatures.validation;

import static org.junit.Assert.*;

import org.junit.Test;

import com.isika.cdi6.candidatures.exception.MoyenneNonValideException;

public class ValidationMoyenneCandidatTest {

	private ValidationMoyenneCandidat valiationMoyenneCandidat = new ValidationMoyenneCandidat();

	@Test
	public void testPasseEnEntretienMoyenneValide() throws MoyenneNonValideException {
		assertTrue(valiationMoyenneCandidat.passeEnEntretien(12.5));
	}

	@Test
	public void testPasseEnEntretienMoyenneNonValide() throws MoyenneNonValideException {
		assertFalse(valiationMoyenneCandidat.passeEnEntretien(9.5));
	}

	@Test(expected = MoyenneNonValideException.class)
	public void testPasseEnEntretienMoyenneNegative() throws MoyenneNonValideException {
		assertFalse(valiationMoyenneCandidat.passeEnEntretien(-0.5));
	}

	@Test(expected = MoyenneNonValideException.class)
	public void testPasseEnEntretienMoyenneDepassantLaLimite() throws MoyenneNonValideException {
		assertFalse(valiationMoyenneCandidat.passeEnEntretien(21.5));
	}
}
