package jungol1120.q1314;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		char[][] alpha = new char[N][N];
		char X = 'A';
		for (int i = 0; i < alpha.length; i++) {
			if (i % 2 == 0 | i == 0) {
				for (int j = 0; j < alpha[i].length; j++) {
					if(X>'Z') {
						X='A';
					}
					alpha[j][i] = X++;
				}
			} else {
				for (int j = N-1; j >=0; j--) {
					if(X>'Z') {
						X='A';
					}
					alpha[j][i] = X++;
				}
			}
		}
		for (int i = 0; i < alpha.length; i++) {
			for (int j = 0; j < alpha[i].length; j++) {
				System.out.print(alpha[i][j] + " ");
			}
			System.out.println();
		}

	}

}
