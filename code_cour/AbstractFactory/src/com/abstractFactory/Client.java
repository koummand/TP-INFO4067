package com.abstractFactory;

public class Client {

	public static void main(String[] args) {
		ProduitFactory produitFactory1 = new ProduitFactory1();
		ProduitFactory produitFactory2 = new ProduitFactory2();
		
		ProduitA produitA = null;
		ProduitB produitB = null;
	
	
		System.out.println("Utilisation de la premiere fabrique");
		produitA = produitFactory1.getProduitA();
		produitB = produitFactory1.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
	
		System.out.println("Utilisation de la seconde fabrique");
		produitA = produitFactory2.getProduitA();
		produitB = produitFactory2.getProduitB();
		produitA.methodeA();
		produitB.methodeB();
		
	}

}
