package jungol1001.q554;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int a = 1;
		char b = 'A';
		
		for(int i =1; i<=num; i++) {
			for(int k = num-i; k>=0; k--) {
				System.out.print(a+" ");
				a++;
			}
			for(int j =1; j<=i; j++) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}

	}

}
