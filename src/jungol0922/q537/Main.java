package jungol0922.q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ix = sc.nextInt();
		sc.close();
		int i = 1;
		int sum = 0;
		while (i <= ix) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
