package jungol0926.q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		a = a+100;
		b = b%10;
		
		System.out.print(a+" "+b);

	}

}
