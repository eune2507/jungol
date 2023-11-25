package jungol1017.q9090;

import java.util.Scanner;

public class Main {
	
	public static int sum(int a , int b) {
		int result = a+b;
		return result;
	}
	public static int mul(int a, int b) {
		int result = a*b;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.print("두 수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println("합 : "+sum(a,b));
		System.out.println("곱 : "+mul(a,b));

	}

}
