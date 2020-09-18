package com.isika.cdi6.candidatures.composants;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;

public class CalculNotesTest {

	private static final double DELTA = 0.0;

	private CalculNotes calculNotes;

	@Before
	public void init() {
		calculNotes = new CalculNotes();
	}

	@Test
	public void testCalculerNoteTestTechniquePositive() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 12.5;

		// 2 - Attendu
		double noteTestTechnique = 25;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteTestTechnique(noteCandidat);

		// 4 - Assertions
		assertEquals(noteTestTechnique, noteCalculee, DELTA);
	}

	@Test
	public void testCalculerNoteTestLogiquePositive() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 14.5;

		// 2 - Attendu
		double noteTestLogique = 43.5;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteTestLogique(noteCandidat);

		// 4 - Assertions
		assertEquals(noteTestLogique, noteCalculee, DELTA);
	}

	@Test
	public void testCalculerNoteDissertationPositive() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 15.5;

		// 2 - Attendu
		double noteDissertation = 23.25;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteDissertation(noteCandidat);

		// 4 - Assertions
		assertEquals(noteDissertation, noteCalculee, DELTA);
	}

	@Test
	public void testCalculerNoteTestTechniqueNulle() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 0;

		// 2 - Attendu
		double noteTestTechnique = 0;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteTestTechnique(noteCandidat);

		// 4 - Assertions
		assertEquals(noteTestTechnique, noteCalculee, DELTA);
	}

	@Test
	public void testCalculerNoteTestLogiqueNulle() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 0;

		// 2 - Attendu
		double noteLogique = 0;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteTestLogique(noteCandidat);

		// 4 - Assertions
		assertEquals(noteLogique, noteCalculee, DELTA);
	}

	@Test
	public void testCalculerNoteDissertationNulle() throws NoteHorsIntervalleException {
		// 1 - Données
		double noteCandidat = 0;

		// 2 - Attendu
		double noteDissertation = 0;

		// 3 - Traitements
		double noteCalculee = calculNotes.noteDissertation(noteCandidat);

		// 4 - Assertions
		assertEquals(noteDissertation, noteCalculee, DELTA);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteTestTechniqueNegative() throws NoteHorsIntervalleException {
		double noteCandidat = -2.0;
		calculNotes.noteTestTechnique(noteCandidat);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteTestLogiqueNegative() throws NoteHorsIntervalleException {
		double noteCandidat = -2.0;
		calculNotes.noteTestLogique(noteCandidat);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteDissertationNegative() throws NoteHorsIntervalleException {
		double noteCandidat = -2.0;
		calculNotes.noteDissertation(noteCandidat);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteTestTechniqueHorsIntervalle() throws NoteHorsIntervalleException {
		double noteCandidat = 25.0;
		calculNotes.noteTestTechnique(noteCandidat);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteTestLogiqueHorsIntervalle() throws NoteHorsIntervalleException {
		double noteCandidat = 25.0;
		calculNotes.noteTestLogique(noteCandidat);
	}

	@Test(expected = NoteHorsIntervalleException.class)
	public void testCalculerNoteDissertationHorsIntervalle() throws NoteHorsIntervalleException {
		double noteCandidat = 25.0;
		calculNotes.noteDissertation(noteCandidat);
	}
}
