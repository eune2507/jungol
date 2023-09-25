package jungol0925.q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		System.out.println(x + " * "+ y + " = "+ (x*y));
		System.out.println(x + " / "+ y + " = "+ (x/y));
	}

}
