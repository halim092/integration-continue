package com.isika.cdi6.candidatures.composants;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;
import com.isika.cdi6.candidatures.utils.Coefficients;

public class CalculNotes {

	/*
	 * Méthodes publiques exposées
	 */
	public double noteTestTechnique(double noteCandidat) throws NoteHorsIntervalleException {
		return calculerNote(noteCandidat, Coefficients.COEF_TEST_TECHNIQUE);
	}

	public double noteTestLogique(double noteCandidat) throws NoteHorsIntervalleException {
		return calculerNote(noteCandidat, Coefficients.COEF_TEST_LOGIQUE);
	}

	public double noteDissertation(double noteCandidat) throws NoteHorsIntervalleException {
		return calculerNote(noteCandidat, Coefficients.COEF_DISSERTATION);
	}

	/*
	 * Méthodes privées de traitement ou calculs
	 */
	
	private double calculerNote(double noteCandidat, double coefficient) throws NoteHorsIntervalleException {
		// On vérifie que la note ne dépasse pas les notes max et min
		validerNoteCandidat(noteCandidat);

		// Si la note est 0 pas besoin de faire une opération de calcul
		if (noteCandidat == 0)
			return noteCandidat;

		// Pour les autres cas
		return noteCandidat * coefficient;
	}

	private void validerNoteCandidat(double noteCandidat) throws NoteHorsIntervalleException {
		if (noteCandidat < 0)
			throw new NoteHorsIntervalleException(
					"Note candidat doit être supérieure ou égale à " + Coefficients.NOTE_MIN);

		if (noteCandidat > Coefficients.NOTE_MAX)
			throw new NoteHorsIntervalleException(
					"Note candidat doit être inférieure ou égale à " + Coefficients.NOTE_MAX);
	}
}
