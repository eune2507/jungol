package jungol0925.q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		String strX = sc.next();
		sc.close();
		
		System.out.printf("%2.2f\n%3.2f\n",x,y);
		System.out.print(strX);

	}

}
