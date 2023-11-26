package jungol1126.q588;

import java.util.Scanner;

public class Main {
	static int N;
	public static void number(int N) {
		if(N != 0) {
			System.out.print(N+" ");
			N--;
			number(N);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		number(N);
	}

}
