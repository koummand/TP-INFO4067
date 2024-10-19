package com.abstractFactory;

public class ProduitFactory2 implements ProduitFactory{

	@Override
	public ProduitA getProduitA() {
		// TODO Auto-generated method stub
		return new ProduitA2();
	}

	@Override
	public ProduitB getProduitB() {
		// TODO Auto-generated method stub
		return new ProduitB2();
	}

}
