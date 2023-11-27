package jungol1127.q9104;

import java.util.Scanner;

public class Main {
	static int sum = 0;
	static int count = 0;
	public static void number(String N) {
		if(count < N.length()) {
			sum += Integer.parseInt(N.substring(count,count+1));
			count++;
			number(N);
		} else {
			System.out.print(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		number(N);
	}

}
