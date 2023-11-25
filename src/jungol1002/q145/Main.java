package jungol1002.q145;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = num*2; j>2*i;j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
