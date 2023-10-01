package jungol1001.q9055;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int sum = 0;
		for (int i = 1;; i++) {
			sum += i;
			if (sum >= X) {

				System.out.print(i + " " + sum);
				break;
			}
		}
	}

}
