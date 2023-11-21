package jungol1121.q9100;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		두 개의 정수 a, b를 입력받아 a보다 10 큰 수와
//		b보다 5 작은 수의 곱을 구하여 출력하는 프로그램을 작성하시오
// 		입력 10 20
//		출력 (10 + 10) * (20 - 5) = 300
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int result = (a+10)*(b-5);
		System.out.print("("+a+" + 10) * ("+b+" - 5) = "+result);
	}

}
