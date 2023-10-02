package jungol1002.q146;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		char a = 'A';
		int b = 0;
		
		for(int i = 1; i<=num; i++) {
			for(int j =num; j>=i; j--) {
				System.out.print(a+" ");
				a++;
			}
			for(int k = 1; k<i; k++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}

	}

}
