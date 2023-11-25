package jungol1005.q597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 0; i < 2 ; i++) {
			String str = sc.next();
			sum = sum + str.length();
		}
		sc.close();
		System.out.print(sum);
		
	}

}
