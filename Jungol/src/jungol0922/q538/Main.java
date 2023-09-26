package jungol0922.q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean bplay = true;
		Scanner sc = new Scanner(System.in);

		while (bplay) {
			System.out.print("number? ");
			int ix = sc.nextInt();

			if (ix < 0) {
				System.out.println("negative number");
			} else if (ix > 0) {
				System.out.println("positive integer");
			} else {
				bplay = false;
			}
		}
		sc.close();
	}
}