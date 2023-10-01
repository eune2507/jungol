package jungol1001.q550;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
