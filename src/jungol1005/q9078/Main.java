package jungol1005.q9078;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] ar1 = new int[3][3];
		int[][] ar2 = new int[3][3];

		for (int i = 0; i < ar1.length; i++) {
			System.out.print("첫 번째 배열 " + (i + 1) + "행 ");
			for (int k = 0; k < ar1[i].length; k++) {
				ar1[i][k] = sc.nextInt();
			}
		}
		for (int i = 0; i < ar2.length; i++) {
			System.out.print("두 번째 배열 " + (i + 1) + "행 ");
			for (int k = 0; k < ar2[i].length; k++) {
				ar2[i][k] = sc.nextInt();
			}
		}
		sc.close();

		for (int i = 0; i < ar1.length; i++) {
			for (int k = 0; k < ar1[i].length; k++) {
				System.out.print(ar1[i][k] + ar2[i][k] + " ");
			}
			System.out.println();
		}

	}

}
