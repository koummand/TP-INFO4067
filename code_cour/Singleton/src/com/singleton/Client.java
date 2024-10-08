package com.singleton;

public class Client {

	public static void main(String[] args) {
		;

		int som1 = OperationMathematique.getInstance().somme(2, 5);
		float moyn1=OperationMathematique.getInstance().moyenne(7, 5);
		System.out.printf("la somme est %d", som1);
		System.out.printf("\nla moyenne est %f", moyn1);

		OperationMathematique s1 = OperationMathematique.getInstance();
		s1.affichage1();
		OperationMathematique s2 = OperationMathematique.getInstance(5, 9);
		s2.affichage2();
		OperationMathematique s3 = OperationMathematique.getInstance(8, 9, 3);
		s3.affichage3();
		
	}

}
