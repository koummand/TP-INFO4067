package com.composite;

public class Client {
	public static void main(String args[]) {
		FIchier sytemDeFichier = new FIchier("monfichier","pdf");
		FIchier sytemDeFichier1 = new FIchier("monfichier","txt");
		Dossier sytemDeFichier2 = new Dossier("monDossier","dossier");
		
		sytemDeFichier.decrire();
		sytemDeFichier1.decrire();
		
		sytemDeFichier2.decrire();
		sytemDeFichier2.ajouter(sytemDeFichier);
		sytemDeFichier2.ajouter(sytemDeFichier);
		sytemDeFichier2.supprimer(sytemDeFichier);
		sytemDeFichier2.obtenir(0);
		

	}

}
