package jungol1020.q9095;

import java.util.Scanner;

public class Main {

	public double sr(int num) {
		double result = Math.sqrt(num);
		return result;
	}
	public double po(double num1, double num2) {
		double result = Math.pow(num1, num2);
		return result;
	}
	public static void main(String[] args) {
		Main main = new Main();
		System.out.print("정사각형의 넓이 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.print("정사각형의 한 변의 길이 : ");
		System.out.printf("%.6f\n",main.sr(x));
		
		System.out.print("밑과 지수 : ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		sc.close();
		System.out.printf("%.6f의 %.6f승은 %.6f입니다.",a,b,main.po(a, b));

	}

}
