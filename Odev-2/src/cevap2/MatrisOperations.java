package cevap2;

public class MatrisOperations <T extends Number> {
	private T[][] number1, number2;
	private int[][] intSum;
	private double[][] doubleSum;
	private float[][] floatSum;

	public void AddNumbers(T[][] number1, T[][] number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public void getSum() {
		if (number1 instanceof Integer[][] && number2 instanceof Integer[][]) {
			this.intSum = new int[number1.length][number2[0].length];
			for (int i = 0; i < intSum.length; i++) {
				for (int j = 0; j < intSum[0].length; j++) {
					for (int k = 0; k < number2.length; k++) {
						intSum[i][j] += number1[i][k].intValue() * number2[k][j].intValue();
					}
				}
			}

			for (int i = 0; i < intSum.length; i++) {
				for (int j = 0; j < intSum[0].length; j++) {
					System.out.print(intSum[i][j] + " - ");
				}
				System.out.println();
			}
			System.out.println();
		} else if (number1 instanceof Double[][] && number2 instanceof Double[][]) {
			this.doubleSum = new double[number1.length][number2[0].length];
			for (int i = 0; i < doubleSum.length; i++) {
				for (int j = 0; j < doubleSum[0].length; j++) {
					for (int k = 0; k < number2.length; k++) {
						doubleSum[i][j] += number1[i][k].doubleValue() * number2[k][j].doubleValue();
					}
				}
			}
			for (int i = 0; i < doubleSum.length; i++) {
				for (int j = 0; j < doubleSum[0].length; j++) {
					System.out.print(doubleSum[i][j] + " - ");
				}
				System.out.println();
			}
			System.out.println();
		} else if (number1 instanceof Float[][] && number2 instanceof Float[][]) {
			this.floatSum = new float[number1.length][number2[0].length];
			for (int i = 0; i < floatSum.length; i++) {
				for (int j = 0; j < floatSum[0].length; j++) {
					for (int k = 0; k < number2.length; k++) {
						floatSum[i][j] += number1[i][k].floatValue() * number2[k][j].floatValue();
					}
				}
			}
			for (int i = 0; i < floatSum.length; i++) {
				for (int j = 0; j < floatSum[0].length; j++) {
					System.out.print(floatSum[i][j] + " - ");
				}
				System.out.println();
			}
		}
	}

}
