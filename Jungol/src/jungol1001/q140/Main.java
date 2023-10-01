package jungol1001.q140;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int avg = 0;
		int a = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num == 0) {
				sc.close();
				break;
			}
			sum += num;
			a++;
			if (a == 20) {
				sc.close();
				break;
			}
		}
		avg = sum / a;
		System.out.print(sum + " " + avg);
	}
}
