package jungol0925.q9017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 실수를 입력하시오.");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		sc.close();
		System.out.print("x = ");
		System.out.printf("%1.2f\n", x);

		System.out.print("y = ");
		System.out.printf("%3.2f", y);
	}

}
