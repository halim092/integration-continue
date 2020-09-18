package com.isika.cdi6.candidatures.composants;

import com.isika.cdi6.candidatures.exception.NoteHorsIntervalleException;
import com.isika.cdi6.candidatures.utils.Coefficients;

/**
 * Calcul de la moyenne d'un candidat en fonction de ses notes.
 */
public class CalculMoyenneCandidat {

	private CalculNotes calculNotes;

	public CalculMoyenneCandidat() {
		this.calculNotes = new CalculNotes();
	}

	/**
	 * Calcule la moyenne des trois notes en fonction des conefficients.
	 * 
	 * @param noteTestTechnique
	 * @param noteTestLogique
	 * @param noteDissertation
	 * @return
	 * @throws NoteHorsIntervalleException
	 */
	public double moyenne(double noteTestTechnique, double noteTestLogique, double noteDissertation)
			throws NoteHorsIntervalleException {

		// @formatter:off
		
		return (calculNotes.noteTestTechnique(noteTestTechnique) + calculNotes.noteTestLogique(noteTestLogique)
					+ calculNotes.noteDissertation(noteDissertation)) 
				/ Coefficients.somme();
		
		// @formatter:on
	}

}
