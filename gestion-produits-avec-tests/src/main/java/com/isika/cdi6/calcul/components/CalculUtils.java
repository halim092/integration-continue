package com.isika.cdi6.calcul.components;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculUtils {

	public static BigDecimal prixArrondi(double value) {
		return new BigDecimal(value).setScale(2, RoundingMode.FLOOR);
	}
	
	public static double somme(double valeur, double ajout) {
		return valeur + ajout;
	}
	
	public static double produit(double valeur, double multiplicateur) {
		return valeur * multiplicateur;
	}
	
	public static double diviser(double valeur, double diviseur) {
		return valeur / diviseur;
	}
}
