package com.builder;

public class Client {

	public static void main(String[] args) {

		MonteurPizza monteurPizza = new MonteurPizzaPiquante();
		Directeur directeur = new Directeur(monteurPizza);

		directeur.construirePizza();

		Pizza pizza = monteurPizza.getPizza();
		pizza.print();
	}

}
