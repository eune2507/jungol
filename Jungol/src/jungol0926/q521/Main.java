package jungol0926.q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int c = a++ * --b;
		System.out.print(a+" "+b+" "+c);

	}

}
