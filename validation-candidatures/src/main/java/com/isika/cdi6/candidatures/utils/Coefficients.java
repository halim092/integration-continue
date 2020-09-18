package com.isika.cdi6.candidatures.utils;

public final class Coefficients {
	
	public static final int MOYENNE_MIN_PASSAGE_ENTRETIEN = 10;
	public static final int NOTE_MAX = 20;
	public static final int NOTE_MIN = 0;
	public static final int COEF_TEST_TECHNIQUE = 2;
	public static final int COEF_TEST_LOGIQUE = 3;

	public static final double COEF_DISSERTATION = 1.5;

	public static final double somme() {
		return COEF_DISSERTATION + COEF_TEST_LOGIQUE + COEF_TEST_TECHNIQUE;
	}
	
	private Coefficients() {
		// Constructeur privé pour interdire d'instancier la classe de constantes
	}
	
}
