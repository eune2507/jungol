package jungol1126.q9103;

import java.util.Scanner;
	
public class Main {
	static int result = 1;
	static int count = 1;
	public static void number(int N) {
		if(count != N) {
			result = result * count++;
			number(N);
		} else {
			result = result * N;
			System.out.print(result);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		number(N);
	}

}
