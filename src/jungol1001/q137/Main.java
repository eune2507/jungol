package jungol1001.q137;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		for(int i = 1; i<=num1; i++) {
			for(int k =1; k<=num2; k++) {
				System.out.print(k*i+" ");
			}
			System.out.println();
		}

	}

}
