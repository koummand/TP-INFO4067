package com.builder;

public class Directeur {
	 
	 MonteurPizza monteurPizza;
	
public Directeur(MonteurPizza monteurpizza) {
	this.monteurPizza=monteurpizza;
}
	public void construirePizza() {
		this.monteurPizza.creerNouvellePizza();
		this.monteurPizza.monterPate();
		this.monteurPizza.monterSauce();
		this.monteurPizza.monterGarniture();	    
    }
}
