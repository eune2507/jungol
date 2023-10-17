package jungol1017.q577;

import java.util.Scanner;

public class Main {

	public static int max(int a) {
		int result = a / 2;
		return result;
	}

	public static int min(int a) {
		int result = a * 2;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if (a > b) {
			System.out.print(max(a) + " " + min(b));
		} else {
			System.out.print(min(a) + " " + max(b));
		}

	}

}
