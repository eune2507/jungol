package jungol1004.q564;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int intX[] = new int[26];

		for (;;) {
			String str = sc.next();
			if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
				for (int i = 0; i < 26; i++) {
					if (str.charAt(0) == 65 + i) {
						intX[i]++;
					}
				}
			} else {
				sc.close();
				break;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (intX[i] != 0) {
				System.out.println(((char) (65 + i)) + " : " + intX[i]);
			}
		}

	}

}
