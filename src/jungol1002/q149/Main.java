package jungol1002.q149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int a = 1;
		
		for(int i = 1; i<=num; i++) {
			for(int k = 1; k<=num; k++) {
				System.out.print(2*a-1+" ");
				a++;
				if(a>5) {
					a = 1;
				}
			}
			System.out.println();
		}

	}

}
