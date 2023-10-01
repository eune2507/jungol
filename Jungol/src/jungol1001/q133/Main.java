package jungol1001.q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		double avg = 0;
		for(int i = 1; i<=num; i++) {
			int a = sc.nextInt();
			sum += a;
		}
		sc.close();
		avg = (double)sum/num;
		
		System.out.printf("%.2f", avg);
	}

}
