package jungol0927.q122;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if(year%400==0) {
			System.out.print("leap year");
		} else if(year%4==0 && year%100!=0) {
			System.out.print("leap year");
		} else {
			System.out.print("common year");
		}

	}

}
