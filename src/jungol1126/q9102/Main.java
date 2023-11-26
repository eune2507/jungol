package jungol1126.q9102;

import java.util.Scanner;

public class Main {
	static int count = 1;
	public static void number(int N) {
		if(count != N) {
			System.out.print(count+" ");
			count++;
			number(N);
		} else {
			System.out.print(N+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		number(N);
	}

}
