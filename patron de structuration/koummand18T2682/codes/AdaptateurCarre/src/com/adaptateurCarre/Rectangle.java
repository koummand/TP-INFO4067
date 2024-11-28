package com.adaptateurCarre;

public class Rectangle {
	
	public float calculPerimettre(float longueur, float largeur) {
		float perimettre = (longueur + largeur) * 2;
		return perimettre;
	};

	public float caculAire(float longeur, float largeur) {
		float aire = (longeur * largeur);
		return aire;
	};
}
