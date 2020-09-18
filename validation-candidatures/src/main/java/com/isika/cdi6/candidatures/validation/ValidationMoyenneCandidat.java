package com.isika.cdi6.candidatures.validation;

import java.text.MessageFormat;

import com.isika.cdi6.candidatures.exception.MoyenneNonValideException;
import com.isika.cdi6.candidatures.utils.Coefficients;

/**
 * Vérifie si un candidat peut passer en entretien en validant sa moyenne.
 */
public class ValidationMoyenneCandidat {

	/**
	 * Indique si la moyenne passée en paramètre permet au candidat de passer en
	 * phase "entretien".<br>
	 * La moyenne doit être comprise entre 10 et 20 pour passer en entretien.
	 * 
	 * @param moyenneCandidat
	 * @return
	 * @throws MoyenneNonValideException
	 */
	public boolean passeEnEntretien(double moyenneCandidat) throws MoyenneNonValideException {

		if (moyenneCandidat < 0 || moyenneCandidat > 20) {
			String message = MessageFormat.format("Moyenne {0} du candidat est invalide (hors limites)",
					moyenneCandidat);
			throw new MoyenneNonValideException(message);
		}

		// Si la moyenne est entre 10 et 20 -> le candidat passe en entretien
		// Sinon il ne passe pas pour les autres cas
		return (moyenneCandidat >= Coefficients.MOYENNE_MIN_PASSAGE_ENTRETIEN
				&& moyenneCandidat <= Coefficients.NOTE_MAX) ? true : false;
	}

}
