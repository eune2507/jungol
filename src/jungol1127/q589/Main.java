package jungol1127.q589;

import java.util.Scanner;

public class Main {
	static int count = 1;
	static int sum = 0;
	public static void number(int N) {
		if(count<N) {
			sum += count++;
			number(N);
		} else if(count == N) {
			sum += count;
			System.out.print(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		number(N);
	}

}
