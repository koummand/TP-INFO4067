package com.composite;

import java.util.ArrayList;

public class Dossier extends SystemDeFichier {
	private String nom;
	private String type;

	public Dossier(String nom, String type) {
		this.nom = nom;
		this.type = type;
	}

	ArrayList<SystemDeFichier> systemFichier = new ArrayList<SystemDeFichier>();

	public void decrire() {
		System.out.println("nom: " + this.nom + " de type: " + this.type);
	}

	public void ajouter(FIchier fichier) {
		systemFichier.add(fichier);
		System.out.println(this.nom + " a ete ajouter");

	}

	public void supprimer(FIchier fichier) {
		systemFichier.remove(fichier);
		System.out.println(this.nom + " a ete supprimer");

	}

	public void obtenir(int indice) {
		systemFichier.get(0);
		System.out.println("obtention " + this.nom);

	}
}
