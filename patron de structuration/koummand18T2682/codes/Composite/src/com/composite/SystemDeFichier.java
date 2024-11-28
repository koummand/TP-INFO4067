package com.composite;

public class SystemDeFichier {
	private String nom;
	private String type;
	
	
	public void decrire() {
		System.out.println("nom: " + this.nom + " de type: " + this.type);
	}
}
