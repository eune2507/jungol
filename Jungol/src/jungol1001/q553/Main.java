package jungol1001.q553;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		char a = 'A';
		for(int i = num; i>=1; i--) {
			for(int j = i; j>=1; j--) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}

	}

}
