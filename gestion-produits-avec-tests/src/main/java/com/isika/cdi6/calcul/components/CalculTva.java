package com.isika.cdi6.calcul.components;

import java.math.BigDecimal;

import com.isika.cdi6.calcul.common.Categorie;
import com.isika.cdi6.calcul.model.Produit;

public class CalculTva {

	/**
	 * Calcule le prix TTC d'un produit selon la TVA associée à la catégorie
	 * 
	 * @param produit Produit dont on veut le prix TTC
	 * @return
	 * @throws IllegalArgumentException Si la catégorie est inonne
	 */
	public BigDecimal calculerPrixToutesTaxes(Produit produit) throws IllegalArgumentException {
		int codeCategorie = produit.getCategorie().getCodeCategorie();
		if (!Categorie.categorieValide(codeCategorie)) {
			throw new IllegalArgumentException(
					String.format("Catégorie produit inconnue : %s", produit.getCategorie()));
		}

		double prixHt = produit.getPrixHorsTaxes().doubleValue();
		double valeurTva = produit.getCategorie().getValeurTva();
		
		double pourcentageTva = CalculUtils.diviser(valeurTva, 100);
		double valeurTaxePrix = CalculUtils.produit(prixHt, pourcentageTva);

		return CalculUtils.prixArrondi(CalculUtils.somme(prixHt, valeurTaxePrix));
	}
	
}
