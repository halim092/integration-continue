package com.isika.cdi6.candidatures.composants;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;

public class CalculMoyenneCandidatTest {

	private static final double DELTA = 0.0;
	private CalculMoyenneCandidat calculMoyenne;

	@Before
	public void init() {
		calculMoyenne = new CalculMoyenneCandidat();
	}

	@Test
	public void testMoyenneAvecNotesValides() throws NoteHorsIntervalleException {
		double expected = 10;
		double actual = calculMoyenne.moyenne(10, 10, 10);
		assertEquals(expected, actual, DELTA);
	}
	
	@Test(expected = NoteHorsIntervalleException.class)
	public void testMoyenneAvecAuMoinsUneNoteNonValide() throws NoteHorsIntervalleException {
		calculMoyenne.moyenne(-5, 10, 10);
	}

}
