package jungol1010.q168;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int[][] pas = new int[N][N];

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

		for (int i = pas.length-1; i >=0 ; i--) {
			for (int j = pas[i].length-1; j >=0 ; j--) {
				if (pas[i][j] != 0) {
					System.out.print(pas[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
