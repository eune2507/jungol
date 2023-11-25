package jungol1002.q147;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int a = 1;
		
		for(int i = 1; i<=num; i++) {
			for(int k = 2; k<2*i; k++) {
				System.out.print(" ");
			}
			for(int j =num; j>=i; j--) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
