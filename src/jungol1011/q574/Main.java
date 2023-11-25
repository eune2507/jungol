package jungol1011.q574;

import java.util.Scanner;

public class Main {
	private int num1, num2, num3;

	public Main() {
		
	}

	public int max(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num1 && num2 > num3) {
			return num2;
		} else {
			return num3;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		Main main = new Main();
		int max = main.max(a, b, c);
		System.out.print(max);

	}

}
