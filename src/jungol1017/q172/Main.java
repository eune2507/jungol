package jungol1017.q172;

import java.util.Scanner;

public class Main {

	public static void box(int a) {
		for(int i = 1; i <= a; i++) {
			for(int j=i; j<=i*a;j+=i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		box(num);
		
	}

}
