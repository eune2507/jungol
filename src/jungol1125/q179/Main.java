package jungol1125.q179;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		sc.close();
		
		double sum1 = A + B + C ;
		double avg1 = sum1/3;
		
		double sum2 = Math.round(A) + Math.round(B) +Math.round(C);
		double avg2 = sum2/3;
		
		System.out.println(Math.round(avg1));
		System.out.println(Math.round(avg2));

	}

}
