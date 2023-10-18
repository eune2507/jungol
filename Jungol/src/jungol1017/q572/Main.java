package jungol1017.q572;

import java.util.Scanner;

public class Main {

	public double circle(double num1) {
		double result = num1 * num1 * 3.14;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		Main main = new Main();
		System.out.printf("%.2f", main.circle(num));

	}

}
