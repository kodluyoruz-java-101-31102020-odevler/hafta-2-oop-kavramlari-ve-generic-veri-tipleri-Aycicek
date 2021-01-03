package cevap2;

import java.util.Random;

public class Matrice {
	public static void main(String[] args) {
		
		Random rnd = new Random();

		// integer sayilar için
		// matris_1
		Integer[][] intArray_1 = new Integer[3][5];
		int intSayi_1 = 0;
		for (int i = 0; i < intArray_1.length; i++) {
			for (int j = 0; j < intArray_1[0].length; j++) {
				intSayi_1 = rnd.nextInt(10);
				intArray_1[i][j] = intSayi_1;
			}
		}
		// matris_2
		Integer[][] intArray_2 = new Integer[5][3];
		int intSayi_2 = 0;
		for (int i = 0; i < intArray_2.length; i++) {
			for (int j = 0; j < intArray_2[0].length; j++) {
				intSayi_2 = rnd.nextInt(10);
				intArray_2[i][j] = intSayi_2;
			}
		}

		MatrisOperations<Number> integerNumbers = new MatrisOperations<>();
		integerNumbers.AddNumbers(intArray_1, intArray_2);
		System.out.println("Integer Matrix Multiplication");
		integerNumbers.getSum();

		System.out.println();

		// double sayilar için
		// matris_1
		Double[][] doubleArray_1 = new Double[3][5];
		double doubleSayi_1 = 0.0;
		for (int i = 0; i < doubleArray_1.length; i++) {
			for (int j = 0; j < doubleArray_1[0].length; j++) {
				doubleSayi_1 = rnd.nextDouble() * (10 - 1 + 1) + 1;// 1 ile 10 arasında rasgele sayi
				doubleArray_1[i][j] = doubleSayi_1;
			}
		}
		// matris_2
		Double[][] doubleArray_2 = new Double[5][6];
		double doubleSayi_2 = 0;
		for (int i = 0; i < doubleArray_2.length; i++) {
			for (int j = 0; j < doubleArray_2[0].length; j++) {
				doubleSayi_2 = rnd.nextDouble() * (10 - 1 + 1) + 1;// 1 ile 10 arasında rasgele sayi
				doubleArray_2[i][j] = doubleSayi_2;
			}
		}

		MatrisOperations<Number> doubleNumbers = new MatrisOperations<>();
		doubleNumbers.AddNumbers(doubleArray_1, doubleArray_2);
		System.out.println("Double Matrix Multiplication");
		doubleNumbers.getSum();
		System.out.println();

		// float sayilar için
		// matris_1
		Float[][] floatArray_1 = new Float[3][5];
		float floatSayi_1 = 0;
		for (int i = 0; i < floatArray_1.length; i++) {
			for (int j = 0; j < floatArray_1[0].length; j++) {
				floatSayi_1 = rnd.nextFloat();
				floatArray_1[i][j] = floatSayi_1;
			}
		}
		// matris_2
		Float[][] floatArray_2 = new Float[4][5];
		float floatSayi_2 = 0;
		for (int i = 0; i < floatArray_2.length; i++) {
			for (int j = 0; j < floatArray_2[0].length; j++) {
				floatSayi_2 = rnd.nextFloat();
				floatArray_2[i][j] = floatSayi_2;
			}
		}

		MatrisOperations<Number> floatNumbers = new MatrisOperations<>();
		floatNumbers.AddNumbers(floatArray_1, floatArray_2);
		System.out.println("Float Matrix Multiplication");
		floatNumbers.getSum();	
		
	}
}

