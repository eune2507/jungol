package jungol0927.q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = sc.nextInt();
		
		int x = a.length()-b;
		if (x<0) {
			x = 0;
		}
		sc.close();
		for (int i =a.length()-1; i>=x;i--) {
			System.out.print(a.charAt(i));
		}

	}

}
