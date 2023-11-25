package jungol1002.q559;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		double[] grade = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		double avg = (double) grade[num1 - 1] + grade[num2 - 1];

		sc.close();
		System.out.printf("%.1f", avg);

	}

}
