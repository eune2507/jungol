package jungol1005.q9080;

public class Main {
	public static void main(String[] args) {

		int[][] pas = new int[5][5];

		for (int i = 0; i < pas.length; i++) {
			pas[i][0] = 1;
			for (int j = 0; j < pas[i].length; j++) {
				if (i == j) {
					pas[i][j] = 1;
				}
			}
		}
		for (int i = 2; i < pas.length; i++) {
			for (int j = 1; j < pas[i].length; j++) {
				if (pas[i][j] == 0) {
					pas[i][j] = pas[i - 1][j] + pas[i - 1][j - 1];
				}
			}
		}

		for (int i = 0; i < pas.length; i++) {
			for (int j = 0; j < pas[i].length; j++) {
				if (pas[i][j] != 0) {
					System.out.print(pas[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
