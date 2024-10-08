package com.factory;

public class Client {

	public static void main(String[] args) {
		ProduitA produitA=null;
		ProduitFactory produitfactory1 = new ProduitFactory1();
		ProduitFactory produitfactory2 = new ProduitFactory2();
		ProduitFactory produitfactory3 = new ProduitFactory3();
		
		
		produitA= produitfactory1.getProduitA();
		produitA.methodeA();
		produitA= produitfactory2.getProduitA();
		produitA.methodeA();
		produitA= produitfactory3.getProduitA();
		produitA.methodeA();

	}

}
