package jungol1010.q164;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar [][] = new int[4][3];
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print((i+1)+"class? ");
			for (int k = 0; k < ar[i].length; k++) {
				ar[i][k] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i<ar.length; i++) {
			System.out.println((i+1)+"class : "+Arrays.stream(ar[i]).sum());
		}

	}

}
