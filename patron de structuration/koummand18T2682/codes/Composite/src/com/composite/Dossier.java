package com.composite;

import java.util.ArrayList;

public class Dossier extends SystemDeFichier {

	public Dossier(String nom, String type) {
		super(nom, type);
	}

	ArrayList<SystemDeFichier> systemFichier = new ArrayList<SystemDeFichier>();

	// Décrire le dossier et récursivement décrire les éléments qu'il contient
	@Override
	public void decrire() {
		// Afficher les informations générales du dossier
		super.decrire();

		// Si le dossier contient des éléments, les décrire récursivement
		if (systemFichier.isEmpty()) {
			System.out.println("Ce dossier est vide.");
		} else {
			System.out.println("Contenu du dossier :");
			for (SystemDeFichier element : systemFichier) {
				element.decrire(); // Appel récursif pour décrire les éléments du dossier
			}
		}
	}

	// Ajouter un fichier ou un dossier au dossier
	public void ajouter(SystemDeFichier fichier) {
	    if (!systemFichier.contains(fichier)) {
	        systemFichier.add(fichier);
	        System.out.println(fichier.nom + "." + fichier.type + " a été ajouté à " + this.nom);
	    } else {
	        System.out.println(fichier.nom + "." + fichier.type + " existe déjà dans " + this.nom);
	    }
	}

	// Supprimer un fichier ou un dossier du dossier (récursivement)
	public void supprimer(SystemDeFichier fichier) {
	    // Vérifie si l'élément à supprimer est directement dans le dossier courant
	    if (systemFichier.remove(fichier)) {
	        // Si c'est un dossier, supprime récursivement tous ses enfants
	        if (fichier instanceof Dossier) {
	            Dossier dossierASupprimer = (Dossier) fichier;
	            while (!dossierASupprimer.systemFichier.isEmpty()) {
	                SystemDeFichier enfant = dossierASupprimer.systemFichier.get(0); // Prend le premier enfant
	                dossierASupprimer.supprimer(enfant); // Supprime récursivement
	            }
	        }
	        System.out.println(fichier.nom + "." + fichier.type + " a été supprimé de " + this.nom);
	        return; // Arrête la recherche si supprimé
	    }

	    // Parcourt récursivement les sous-dossiers pour chercher l'élément
	    for (SystemDeFichier element : systemFichier) {
	        if (element instanceof Dossier) {
	            ((Dossier) element).supprimer(fichier);
	            return; // Arrête la recherche après suppression réussie
	        }
	    }

	    // Si l'élément n'est pas trouvé
	    System.out.println(fichier.nom + "." + fichier.type + " n'a pas été trouvé dans " + this.nom);
	}

	// Obtenir un élément à l'indice spécifié
	public SystemDeFichier obtenir(int indice) {
		if (indice >= 0 && indice < systemFichier.size()) {
			SystemDeFichier element = systemFichier.get(indice);
			System.out.println("Obtention de l'élément: " + element.nom + "." + element.type);
			return element;
		} else {
			System.out.println("Indice invalide");
			return null;
		}
	}

}
