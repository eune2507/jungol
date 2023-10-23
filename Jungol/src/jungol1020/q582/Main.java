package jungol1020.q582;

import java.util.Scanner;

public class Main {
	
	public double circler(int num) {
		double result = Math.sqrt(num/3.14);
		return result;
	}
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		sc.close();
		System.out.printf("%.2f", main.circler(S));
	}

}
