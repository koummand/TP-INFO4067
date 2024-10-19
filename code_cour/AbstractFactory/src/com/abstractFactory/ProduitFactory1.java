package com.abstractFactory;

public class ProduitFactory1 implements ProduitFactory{

	@Override
	public ProduitA getProduitA() {
		// TODO Auto-generated method stub
		return new ProduitA1();
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB1();
	}

}
