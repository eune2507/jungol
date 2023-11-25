package jungol0926.q117;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		sc.close();
		
		int sum = (int)a + (int)b + (int)c;
		int avg = (int)(a+b+c)/3;
		
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);

	}

}
