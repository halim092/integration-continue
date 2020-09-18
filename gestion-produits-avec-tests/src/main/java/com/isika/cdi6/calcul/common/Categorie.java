package com.isika.cdi6.calcul.common;

import java.util.Arrays;

public enum Categorie {

	// @formatter:off
	
	PRODUITS_RESTAURATION(1, 5.5), 
	PRODUITS_CONSTRUCTION(2, 10), 
	PRODUITS_CONSOMMATION(3, 20), 
	INCONNUE(4, 0)
	
	// @formatter:on
	;

	private int codeCategorie;
	private double valeurTva;

	private Categorie(int codeCategorie, double valeurTva) {
		this.codeCategorie = codeCategorie;
		this.valeurTva = valeurTva;
	}

	public int getCodeCategorie() {
		return codeCategorie;
	}

	public double getValeurTva() {
		return valeurTva;
	}

	public static Categorie getFromCode(int codeCategorie) {
		return Arrays.stream(values()).filter(cat -> cat.getCodeCategorie() == codeCategorie).findFirst().get();
	}
	
	public static boolean categorieValide(int codeCategorie) {
		switch (codeCategorie) {
		case 1:
		case 2:
		case 3:
			return true;
		default:
			return false;
		}
	}
}
