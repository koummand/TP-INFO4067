package com.adaptateurCarre;

public class AdapterCarre implements Icarre {
	Rectangle rectangle = new Rectangle();

	@Override
	public float calculPerimettre(float cote) {
		float perimettre = rectangle.calculPerimettre(cote, cote);
		return perimettre;
	}

	@Override
	public float calculAire(float cote) {
		float aire = rectangle.caculAire(cote, cote);
		return aire;
	}
}
