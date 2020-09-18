package com.isika.cdi6.calcul.components;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.isika.cdi6.calcul.common.Categorie;
import com.isika.cdi6.calcul.model.Produit;

public class CalculTvaTest {

	private CalculTva calculTva;

	@Before
	public void avantChaqueTest() {
		calculTva = new CalculTva();
	}
	
	@Test
	public void testCalculerPrixToutesTaxesCategorieRestauration() {
		// 1 - Etat de départ (prépa des données)
		Produit baguette = new Produit("Baguette", Categorie.PRODUITS_RESTAURATION, new BigDecimal(1));
		
		// 2 - Attendu 
		BigDecimal prixTtcAttendu = CalculUtils.prixArrondi(1.05);
		
		BigDecimal prixToutesTaxes = calculTva.calculerPrixToutesTaxes(baguette);
		
		// 4 - Assertions (vérifications)
		assertEquals("Le prix TTC de la baguette (1€ HT) n'est pas égal au prix attendu", 
				prixTtcAttendu, prixToutesTaxes);
	}

	@Test
	public void testCalculerPrixToutesTaxesCategorieConstruction() {
		
		Produit metal = new Produit("Metal", Categorie.PRODUITS_CONSTRUCTION, new BigDecimal(10));
		
		BigDecimal prixTtcAttendu = CalculUtils.prixArrondi(11);
		
		BigDecimal prixToutesTaxes = calculTva.calculerPrixToutesTaxes(metal);
		
		assertEquals("Le prix TTC du métal (10€ HT) n'est pas égal au prix attendu", 
				prixTtcAttendu, prixToutesTaxes);
	}
	
	@Test
	public void testCalculerPrixToutesTaxesCategorieConsommation() {
		Produit metal = new Produit("Manette PS4", Categorie.PRODUITS_CONSOMMATION, new BigDecimal(50));
		
		BigDecimal prixTtcAttendu = CalculUtils.prixArrondi(60);
		
		BigDecimal prixToutesTaxes = calculTva.calculerPrixToutesTaxes(metal);
		
		assertEquals("Le prix TTC de la manette PS4 (50€ HT) n'est pas égal au prix attendu", 
				prixTtcAttendu, prixToutesTaxes);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testCalculerPrixToutesTaxesCategorieInconnue() {
		Produit inconnue = new Produit("Inconnue", Categorie.INCONNUE, new BigDecimal(50));
		BigDecimal prixTtcAttendu = CalculUtils.prixArrondi(0);
		BigDecimal prixToutesTaxes = calculTva.calculerPrixToutesTaxes(inconnue);
		assertEquals(prixTtcAttendu, prixToutesTaxes);
	}
}
