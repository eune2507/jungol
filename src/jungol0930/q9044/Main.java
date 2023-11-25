package jungol0930.q9044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int x = 0;
		for (;;) {
			int num = sc.nextInt();
			if (num % 2 == 1) {
				sum = sum + num;
				x++;
			}
			if (num == 0) {
				sc.close();
				break;
			}

		}
		avg = sum / x;
		System.out.println("홀수의 합 = " + sum);
		System.out.println("홀수의 평균 = " + avg);

	}

}