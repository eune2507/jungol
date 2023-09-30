package jungol0930.q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		double avg = 0;
		int x = 0;

		for (;;) {
			int num = sc.nextInt();

			if (num > 100 | num < 0) {
				sc.close();
				break;
			}
			sum += num;
			x++;
		}
		avg = (double) sum / x;
		System.out.println("sum : " + sum);
		System.out.print("avg : ");
		System.out.printf("%.1f", avg);

	}

}
