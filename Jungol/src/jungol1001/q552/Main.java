package jungol1001.q552;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k = num-i; k>=0; k--) {
				System.out.print("*");
			}
			for(int z = num-i; z>=1; z--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
