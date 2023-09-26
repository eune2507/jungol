package jungol0926.q526;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		
		double dx = a*b;
		int ix = (int)dx;
		
		int iy = (int)a * (int)b;
		
		System.out.print(ix+" ");
		System.out.print(iy+" ");

	}

}
