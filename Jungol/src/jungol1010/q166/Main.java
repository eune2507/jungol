package jungol1010.q166;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar1 [][] = new int[2][3];
		int ar2 [][] = new int[2][3];
		System.out.println("first array");
		for (int i = 0; i < ar1.length; i++) {
			for (int k = 0; k <ar1[i].length; k++) {
				ar1[i][k] = sc.nextInt();
			}
		}
		System.out.println("second array");
		for (int i = 0; i < ar2.length; i++) {
			for (int k = 0; k <ar2[i].length; k++) {
				ar2[i][k] = sc.nextInt();
			}
		}
		sc.close();
		
		int num [][] = new int[2][3];
		for(int i = 0; i<num.length; i++) {
			for (int k = 0; k <num[i].length; k++) {
				num[i][k] = ar1[i][k] * ar2[i][k];
				System.out.print(num[i][k]+" ");
			}
			System.out.println();
		}

	}

}
