package jungol0926.q632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		if(a<b && a<c) {
			System.out.print(a);
		}
		if(b<c && b<a) {
			System.out.print(b);
		}
		if(c<a && c<b) {
			System.out.print(c);
		}
	}
}
