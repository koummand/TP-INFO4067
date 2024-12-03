package com.composite;

public class Fichier extends SystemDeFichier {


	public Fichier(String nom, String type) {
		super(nom, type);
	}

	// Décrire le fichier
	public void decrire() {
		super.decrire();
	}

	// Implémentation des méthodes de l'interface, mais elles ne font rien pour un
	// fichier
	public void ajouter(SystemDeFichier fichier) {
		throw new UnsupportedOperationException("Ajout impossible dans un fichier");
	}

	public void supprimer(SystemDeFichier fichier) {
		throw new UnsupportedOperationException("Suppression impossible dans un fichier");
	}

	public SystemDeFichier obtenir(int indice) {
		throw new UnsupportedOperationException("Aucun élément à obtenir dans un fichier");
	}
}
