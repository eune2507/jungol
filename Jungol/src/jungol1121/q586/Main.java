package jungol1121.q586;

import java.util.Scanner;

public class Main {

	public static int mat1(int num1, int num2) {
		int result = 0;
		int dis = 0;
		if ( num1 > num2) {
			dis = num1 - num2;
		} else {
			dis = num2 - num1;
		}
		result = (int)Math.pow(dis,2);
		
		return result;
	}
	public static int mat2(int num1, int num2) {
		int result = 0;
		int sum = num1 + num2;
		result = (int)Math.pow(sum,3);
		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println("("+a+" - "+b+") ^ 2 = "+ mat1(a,b));
		System.out.println("("+a+" + "+b+") ^ 3 = "+ mat2(a,b));
	}

}
