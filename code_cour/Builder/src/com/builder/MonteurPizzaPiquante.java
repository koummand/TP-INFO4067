package com.builder;

public class MonteurPizzaPiquante extends MonteurPizza {
    
	@Override
	public void monterPate() {
		pizza.setPate("feuilletee");
		
	}

	@Override
	public void monterSauce() {
		pizza.setSauce("piquante")	;	
	}

	@Override
	public void monterGarniture() {
		pizza.setGarniture("pepperoni+salami");
	}
	

}
