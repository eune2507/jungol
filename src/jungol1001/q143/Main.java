package jungol1001.q143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			for(int j =1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k =num; k>=i; k--) {
				System.out.print("*");
			}
			for(int k =num; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i =1; i<num; i++) {
			for(int j =num-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int k =0; k<=i; k++) {
				System.out.print("*");
			}
			for(int k =1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
