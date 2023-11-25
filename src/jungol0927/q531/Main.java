package jungol0927.q531;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pkg = sc.nextDouble();
		sc.close();
		
		if(pkg>88.45) {
			System.out.print("Heavyweight");
		} else if(pkg<=50.80) {
			System.out.print("Flyweight");
		} else if(pkg<=61.23) {
			System.out.print("Lightweight");
		} else if(pkg<=72.57) {
			System.out.print("Middleweight");
		} else {
			System.out.print("Cruiserweight");
		}

	}

}
