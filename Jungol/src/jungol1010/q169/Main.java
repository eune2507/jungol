package jungol1010.q169;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ar [][] = new String[3][5];
		
		for(int i = 0; i < ar.length; i++) {
			for(int k = 0; k<ar[i].length; k++) {
				ar[i][k] = sc.next().toLowerCase();
			}
		}
		sc.close();
		for(int i = 0; i < ar.length; i++) {
			for(int k = 0; k<ar[i].length; k++) {
				System.out.print(ar[i][k]+" ");
			}
			System.out.println();
		}
	}
}
