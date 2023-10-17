package jungol1017.q9089;

import java.util.Scanner;

public class Main {

	public static void chg1(int a, int b) {
		int ch = a;
		a = b;
		b = ch;
		System.out.print("첫 번째 함수 실행중");
		System.out.print(" x = " + a + ", y = " + b);
		ch = a;
		a = b;
		b = ch;
		System.out.print("\n첫 번째 함수 실행후");
		System.out.print(" a = " + a + ", b = " + b);

	}

	public static void chg2(int a, int b) {
		int ch = a;
		a = b;
		b = ch;
		System.out.print("\n두 번째 함수 실행중");
		System.out.print(" x = " + a + ", y = " + b);
		System.out.print("\n두 번째 함수 실행후");
		System.out.print(" a = " + a + ", b = " + b);
	}

	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		chg1(a, b);
		chg2(a, b);

	}

}
