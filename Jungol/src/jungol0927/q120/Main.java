package jungol0927.q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		sc.close();
		
		if(X>Y) {
			System.out.print(X-Y);
		} else {
			System.out.print(Y-X);
		}

	}

}
