package com.isika.cdi6.calcul.model;

import java.math.BigDecimal;
import java.util.UUID;

import com.isika.cdi6.calcul.common.Categorie;

public class Produit {

	private String id;
	private String libelle;
	private Categorie categorie;
	private BigDecimal prixHorsTaxes;

	public Produit() {
		this.id = UUID.randomUUID().toString();
	}

	public Produit(String libelle, Categorie categorie, BigDecimal prixHorsTaxes) {
		this();
		this.libelle = libelle;
		this.categorie = categorie;
		this.prixHorsTaxes = prixHorsTaxes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public BigDecimal getPrixHorsTaxes() {
		return prixHorsTaxes;
	}

	public void setPrixHorsTaxes(BigDecimal prixHorsTaxes) {
		this.prixHorsTaxes = prixHorsTaxes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Produit [id=");
		builder.append(id);
		builder.append(", libelle=");
		builder.append(libelle);
		builder.append(", categorie=");
		builder.append(categorie);
		builder.append(", prixHorsTaxes=");
		builder.append(prixHorsTaxes);
		builder.append("]");
		return builder.toString();
	}

}
