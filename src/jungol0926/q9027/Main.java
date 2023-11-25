package jungol0926.q9027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		double sum = a+b;
		int sum1 = (int)sum;
		
		int sum2 = (int)a + (int)b;
		
		System.out.print(sum1+" "+sum2);

	}

}
