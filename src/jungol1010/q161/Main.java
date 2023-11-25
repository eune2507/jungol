package jungol1010.q161;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[11];

		for (;;) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			}
			if (num / 10 == 10) {
				ar[10]++;
			} else if (num / 10 == 9) {
				ar[9]++;
			} else if (num / 10 == 8) {
				ar[8]++;
			} else if (num / 10 == 7) {
				ar[7]++;
			} else if (num / 10 == 6) {
				ar[6]++;
			} else if (num / 10 == 5) {
				ar[5]++;
			} else if (num / 10 == 4) {
				ar[4]++;
			} else if (num / 10 == 3) {
				ar[3]++;
			} else if (num / 10 == 2) {
				ar[2]++;
			} else if (num / 10 == 1) {
				ar[1]++;
			} else if (num / 10 == 0) {
				ar[0]++;
			}
		}

		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] != 0) {
				System.out.println(i * 10 + " : " + ar[i] + " person");
			}
		}

	}

}
