package jungol1125.q181;

import java.util.Scanner;

public class Main {

	public static double circle(double r) {
		double result = 3.141592 * r * r;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.print("radius : ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.printf("area = %.3f", circle(r));

	}

}
