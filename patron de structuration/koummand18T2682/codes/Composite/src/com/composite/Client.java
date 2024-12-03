package com.composite;

public class Client {
	public static void main(String args[]) {
		// Création des fichiers
		SystemDeFichier fichierPdf = new Fichier("monfichier", "pdf");
		SystemDeFichier fichierTxt = new Fichier("monfichier", "txt");
		
		// Création du dossier
		SystemDeFichier dossier = new Dossier("monDossier", "dossier");

		// Affichage de la description des fichiers et du dossier
		fichierPdf.decrire();
		fichierTxt.decrire();
		dossier.decrire();

		// Ajout de fichiers dans le dossier
		dossier.ajouter(fichierPdf);
		dossier.ajouter(fichierTxt);

		// Affichage après ajout
		System.out.println("\nAprès ajout des fichiers :");
		dossier.decrire();

		// Suppression d'un fichier du dossier
		dossier.supprimer(fichierPdf);
	

		// Affichage après suppression
		System.out.println("\nAprès suppression d'un fichier :");
		dossier.decrire();

		// Obtention d'un élément à l'indice 0
		System.out.println("\nObtention de l'élément à l'indice 0 :");
		dossier.obtenir(0);
	}
}
