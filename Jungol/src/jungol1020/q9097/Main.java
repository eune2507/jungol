package jungol1020.q9097;

import java.util.Scanner;

public class Main {
	public double fir(double num) {
		double result = 2 * num * 3.14;
		return result;
	}
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		System.out.printf("%.2f",main.fir(r));
	}

}
