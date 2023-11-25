package jungol1001.q138;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=num; i++) {
			for(int k = 1; k<=num; k++) {
				System.out.print("("+i+", "+k+") ");
			}
			System.out.println();
		}

	}

}
