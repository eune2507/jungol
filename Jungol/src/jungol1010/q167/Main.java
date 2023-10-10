package jungol1010.q167;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar [][] = new int[4][2];
		
		for(int i = 0; i<ar.length; i++) {
			for(int k = 0; k < ar[i].length; k++) {
				ar[i][k] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i<ar.length; i++) {
			int sum = 0;
			for(int k = 0; k<ar[i].length; k++) {
				sum += ar[i][k];
			}
			System.out.print(sum/ar[i].length+" ");
		}
		System.out.println();
		for(int i =0; i<ar[i].length; i++) {
			int sum = 0;
			for(int k = 0; k<ar.length; k++) {
				sum += ar[k][i];
			}
			System.out.print(sum/ar.length+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i =0; i<ar.length; i++) {
			for (int k = 0; k <ar[i].length; k++) {
				sum += ar[i][k];
			}
		}
		System.out.print(sum/(ar.length*ar[0].length));
		
	}

}
