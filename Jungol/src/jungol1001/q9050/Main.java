package jungol1001.q9050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		for(int i = 0; i<=num; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}
