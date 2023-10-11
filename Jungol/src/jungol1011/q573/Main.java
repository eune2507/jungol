package jungol1011.q573;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a = 1;
		for (int i = 0; i<n; i++) {
			for(int k = 0; k<n; k++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}

	}

}
