package jungol1001.q139;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		if (num1 < num2) {
			for (int i = 1; i <= 9; i++) {
				for (int k = num1; k <= num2; k++) {
					System.out.print(k + " * " + i + " =");
					System.out.printf("%3d   ", k * i);
				}
				System.out.println();
			}
		} else if (num1 > num2) {
			for (int i = 1; i <= 9; i++) {
				for (int k = num1; k >= num2; k--) {
					System.out.print(k + " * " + i + " =");
					System.out.printf("%3d   ", k * i);
				}
				System.out.println();
			}
		} else if (num1 == num2) {
			for (int i = 1; i <= 9; i++) {
				for (int k = num1; k >= num2; k--) {
					System.out.print(k + " * " + i + " =");
					System.out.printf("%3d   ", k * i);
				}
				System.out.println();
			}
		}
	}
}
