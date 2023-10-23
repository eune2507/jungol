package jungol1019.q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		for (int i = 0; i < 1; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a < 2 || a > 9) {
				System.out.println("INPUT ERROR!");
				i--;
			} else if (b < 2 || b > 9) {
				System.out.println("INPUT ERROR!");
				i--;
			}
		}
		sc.close();
		// 4 * 1 = 4 3 * 1 = 3
		if (a > b) {
			for (int i = 1; i <= 9; i++) {
				for (int j = a; j >= b; j--) {
					System.out.printf("%d * %d =%3d   ",j,i,(j*i));
				}
				System.out.println();
			}
		} else {
			for (int i = 1; i <= 9; i++) {
				for (int j = a; j <= b; j++) {
					System.out.printf("%d * %d =%3d   ",j,i,(j*i));
				}
				System.out.println();
			}
		}

	}

}
