package jungol0930.q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int odd = 0;
		int even = 0;

		for (;;) {
			int num = sc.nextInt();
			if (num % 2 == 0 && num != 0) {
				even++;
			} else if (num % 2 == 1) {
				odd++;
			} else if (num == 0) {
				sc.close();
				break;
			}
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}

}
