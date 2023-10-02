package jungol1002.q144;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			for(int k =num*2; k>2*i; k--) {
				System.out.print(" ");
			}
			for(int s =1; s<2*i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
