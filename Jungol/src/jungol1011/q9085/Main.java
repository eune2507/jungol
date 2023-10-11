package jungol1011.q9085;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int add = a+b;
		int sub = Math.abs(a-b);
		System.out.println("두 수의 합 = "+add);
		System.out.println("두 수의 차 = "+sub);

	}

}
