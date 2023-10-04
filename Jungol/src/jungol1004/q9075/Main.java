package jungol1004.q9075;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[] = new int[10];

		for (;;) {
			int X = sc.nextInt();
			if (X == 0) {
				sc.close();
				break;
			}
			for (int i = 0; i < ar.length; i++) {
				if (X % 10 == i) {
					ar[i]++;
				}
			}
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.println(i + " : " + ar[i] + "개");
			}
		}

	}

}
