package jungol1120.q1856;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		sc.close();

		int[][] num = new int[H][W];
		int count = 1;
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0 | i == 0) {
				for (int j = 0; j < num[i].length; j++) {
					num[i][j] = count++;
				}
			} else {
				for(int j = W-1; j>=0; j--) {
					num[i][j] = count++;
				}
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
