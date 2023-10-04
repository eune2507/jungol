package jungol1004.q157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		double avg = 0;
		int a = 0;

		for (;;) {
			int X = sc.nextInt();
			if (X == 0) {
				sc.close();
				break;
			} else if (X % 5 == 0) {
				sum += X;
				a++;
			}
		}

		avg = (double) sum / a;
		System.out.println("Multiples of 5 : " + a);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}
