package jungol0920.q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// case 1
//		String strX = scanner.nextLine();
//		int x = Integer.parseInt(strX);

		// case 2
		int x = scanner.nextInt();
		scanner.close();

		System.out.println(x);
		if (x < 0) {
			System.out.println("minus");
		}
	}
}