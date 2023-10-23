package jungol1019.q9094;

import java.util.Scanner;

public class Main {
	public int intsub(int num1, int num2) {
		int result = 0;
		if(num1>num2) {
			result = num1-num2;
		} else {
			result = num2-num1;
		}
		return result;
	}
	public double dousub(double num1, double num2) {
		double result = 0;
		if(num1>num2) {
			result = num1-num2;
		} else {
			result = num2-num1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main main = new Main();
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		
		System.out.println("두 정수의 차 : "+ main.intsub(a,b));
		System.out.print("두 실수의 차 : ");
		System.out.printf("%.6f", main.dousub(x, y));

	}

}
