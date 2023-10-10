package jungol1010.q165;

public class Main {

	public static void main(String[] args) {
		int ar[][] = new int[5][5];
		ar[0][0] = 1;
		ar[0][2] = 1;
		ar[0][4] = 1;

		for (int i = 1; i < ar.length; i++) {
			for (int k = 0; k < ar[i].length; k++) {
				if (k - 1 < 0) {
					ar[i][k] = ar[i - 1][k + 1];
				} else if (k + 1 == 5) {
					ar[i][k] = ar[i - 1][k - 1];
				} else {
					ar[i][k] = ar[i - 1][k - 1] + ar[i - 1][k + 1];
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int k = 0; k < ar[i].length; k++) {
				System.out.print(ar[i][k] + " ");
			}
			System.out.println();
		}
	}
}
