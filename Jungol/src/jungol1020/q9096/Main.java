package jungol1020.q9096;

import java.util.Scanner;

public class Main {
	public double circle(int num) {
		double result = num * num * 3.14;
		return result;
	}
	public static void main(String[] args) {
		Main main = new Main();
		System.out.print("원의 반지름 : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		System.out.println("원의 넓이");
		System.out.printf("버림 : %.0f\n", Math.floor(main.circle(r)));
		System.out.println("반올림 : "+ Math.round(main.circle(r)));
		System.out.printf("올림 : %.0f", Math.ceil(main.circle(r)));
	}

}
