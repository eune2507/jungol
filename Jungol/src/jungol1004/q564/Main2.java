package jungol1004.q564;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[] = new int[10];

		for (;;) {
			int X = sc.nextInt();
			if (X > 0 && X <= 10) {
				for (int i = 0; i < 10; i++) {
					if (X == i + 1) {
						ar[i]++;
					}
				}
			} else {
				sc.close();
				break;
			}
		}
		for (int i = 0; i<10; i++) {
			if(ar[i] != 0) {
				System.out.println((i+1)+" : "+ ar[i] + "개");
			}
		}
	}
}
