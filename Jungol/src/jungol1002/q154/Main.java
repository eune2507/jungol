package jungol1002.q154;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double ar[] = new double[6];
		double sum = 0;
		double avg = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextDouble();
			sum += ar[i];
		}
		sc.close();
		avg = sum / ar.length;

		System.out.printf("%.1f", avg);

	}

}
