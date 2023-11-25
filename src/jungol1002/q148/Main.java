package jungol1002.q148;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			for(int k = 1; k<=i; k++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for(int i = 1; i<num; i++) {
			for(int k = 1; k<=2*i; k++) {
				System.out.print(" ");
			}
			for(int j = num; j>i; j--) {
				System.out.print("# ");
			}
			System.out.println();
		}

	}

}
