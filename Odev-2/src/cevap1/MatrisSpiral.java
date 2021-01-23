package cevap1;

public class MatrisSpiral {

	public void printSpiral(int[] dizi, int[][] matris) {

		int uzunluk = matris.length;
		int indis = 0;

		for (int i = 0; i < (uzunluk + 1) / 2; i++) {
			for (int j = i; j < uzunluk - i; j++) {
				matris[i][j] = dizi[indis];
				indis++;
			}

			for (int k = i + 1; k < uzunluk - i; k++) {
				matris[k][uzunluk - i - 1] = dizi[indis];
				indis++;
			}

			for (int l = uzunluk - i - 1; l > i; l--) {
				matris[uzunluk - i - 1][l - 1] = dizi[indis];
				indis++;
			}

			for (int m = uzunluk - i - 2; m > i; m--) {
				matris[m][i] = dizi[indis];
				indis++;
			}
		}
		for (int i = 0; i < uzunluk; i++) {
			for (int j = 0; j < uzunluk; j++) {
				System.out.print(matris[i][j] + "•");
			}
			System.out.println();
		}
	}
}
