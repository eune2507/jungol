package jungol0925.q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double a = sc.nextDouble();
		double dyd = 91.44;
		sc.close();
		
		System.out.print("10.1yard = ");
		System.out.printf("%3.1f",a*dyd);
		System.out.print("cm");

	}

}
