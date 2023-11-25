package jungol1017.q173;

import java.util.Scanner;

public class Main {

	public static int mul(int a, int b) {
		int max, min;
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		int result = (max*max) - (min*min);
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.print(mul(a,b));

	}

}
