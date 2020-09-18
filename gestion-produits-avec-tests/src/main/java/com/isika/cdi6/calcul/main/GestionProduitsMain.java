package com.isika.cdi6.calcul.main;

import java.math.BigDecimal;
import java.util.Scanner;

import com.isika.cdi6.calcul.common.Categorie;
import com.isika.cdi6.calcul.components.CalculTva;
import com.isika.cdi6.calcul.model.Produit;

public class GestionProduitsMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Veuillez saisir les infos d'un produit");

		System.out.println("Libellé du produit ");
		String libelle = scanner.next();

		System.out.println("Code catégorie (1 / 2 / 3)");
		int codeCategorie = scanner.nextInt();

		System.out.println("Prix HT");
		BigDecimal prixHorsTaxes = scanner.nextBigDecimal();

		Categorie categorie = Categorie.getFromCode(codeCategorie);

		//@formatter:off
		Produit produit = 
				new Produit(libelle, categorie, prixHorsTaxes);

		CalculTva calculTva = 
				new CalculTva();
		//@formatter:on

		BigDecimal prixTtc = calculTva.calculerPrixToutesTaxes(produit);

		System.out.println("Le prix TTC du produit saisi est de : " + prixTtc + " €");

		scanner.close();
	}

}
