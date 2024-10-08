package com.singleton;

public final class OperationMathematique {

	private static OperationMathematique intance = null;
	int x;
	int y;
	int z;

	private OperationMathematique() {
		super();
	}

	private OperationMathematique(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private OperationMathematique(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static OperationMathematique getInstance() {
		if (intance == null) {
			intance = new OperationMathematique();
		}
		return intance;
	}

	public static OperationMathematique getInstance(int x, int y) {
		if (intance == null) {
			intance = new OperationMathematique(x, y);
		}
		return intance;
	}

	public static OperationMathematique getInstance(int x, int y, int z) {
		if (intance == null) {
			intance = new OperationMathematique(x, y, z);
		}
		return intance;
	}

	public int somme(int x, int y) {
		return x + y;
	}

	public int somme(int x, int y, int z) {
		return x + y + z;
	}

	public float moyenne(int x, int y) {
		return somme(x, y) / 2;
	}

	public float moyenne(int x, int y, int z) {
		return somme(x, y, z) / 3;
	}

	public void affichage1() {
		System.out.println("\n\nJe suis une instance sans valeur");
	}

	public void affichage2() {
		System.out
				.println("\nJe suis une instance a deux valeur mes valeurs sont : x = " + this.x + " et y = " + this.y);
	}

	public void affichage3() {
		System.out.println("\nJe suis une instance a trois valeur mes valeurs sont : x = " + this.x + " , y= " + this.y
				+ " et z = " + this.z);
	}

}
