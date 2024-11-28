package com.composite;

public class FIchier extends SystemDeFichier {
	private String nom;
	private String type;

	public FIchier(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

	public void decrire() {
		System.out.println("nom: " + this.nom + " de type: " + this.type);
	}
}
