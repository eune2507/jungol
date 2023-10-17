package jungol1017.q171;

import java.util.Scanner;

public class Main {

	public static int sum(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.print(sum(num));

	}

}
