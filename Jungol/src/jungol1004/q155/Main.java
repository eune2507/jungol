package jungol1004.q155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char chaX[] = { 'J', 'U', 'N', 'G', 'O', 'L' };
		int count = 0;

		for (int i = 0; i < chaX.length; i++) {
			if (str.charAt(0) == chaX[i]) {
				System.out.println(i);
			} else {
				count++;
			}
		}
		if (count == 6) {
			System.out.println("none");
			sc.close();
		}
	}
}
