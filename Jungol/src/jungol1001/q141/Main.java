package jungol1001.q141;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 1;; i++) {
			if (num * i <= 100) {
				System.out.print(num * i + " ");
				if (num * i % 10 == 0) {
					break;
				}
			} else {
				break;
			}

		}

	}

}
