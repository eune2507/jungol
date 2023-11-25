package jungol0930.q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = 0;

		for (;;) {
			int num = sc.nextInt();

			if (num == 0) {
				sc.close();
				break;
			} else if (num % 3 == 0 || num % 5 == 0) {
				x--;
			}
			x++;
		}
		System.out.print(x);

	}

}
