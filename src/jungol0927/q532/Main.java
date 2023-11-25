package jungol0927.q532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();
		double Y = sc.nextDouble();
		
		sc.close();
		
		if(X>=4.0 && Y>=4.0) {
			System.out.print("A");
		} else if(X>=3.0 && Y>=3.0) {
			System.out.print("B");
		} else {
			System.out.print("C");
		}

	}

}
