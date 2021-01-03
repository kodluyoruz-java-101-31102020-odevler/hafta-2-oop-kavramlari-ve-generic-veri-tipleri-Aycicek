package cevap3;


public class ArrayOperation {

	public void print(int[] dizi) {
		
		System.out.println("");
		for (int j = 0; j < dizi.length; j++) {
			System.out.print(dizi[j] + " ");
		}
		System.out.println();
		System.out.println("Tekrar eden değerler");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j])
					System.out.print(dizi[i] + " ");
			}
		}

	}
}
