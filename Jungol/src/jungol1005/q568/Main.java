package jungol1005.q568;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] ar1 = new int[2][4];
		int [][] ar2 = new int[2][4];
		
		System.out.println("first array");
		for(int i = 0; i < ar1.length; i++) {
			for (int k = 0; k < ar1[i].length; k++) {
				ar1[i][k] = sc.nextInt();
			}
		}
		
		System.out.println("second array");
		for(int i = 0; i < ar2.length; i++) {
			for (int k = 0; k < ar2[i].length; k++) {
				ar2[i][k] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i < ar1.length; i++) {
			for (int k = 0; k < ar1[i].length; k++) {
				System.out.print(ar1[i][k]*ar2[i][k]+" ");
			}
			System.out.println();
		}

	}

}
