package jungol1002.q151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[5];

		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		System.out.print(ar[0]+ar[2]+ar[4]);

	}

}
