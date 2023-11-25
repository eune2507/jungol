package jungol1001.q9052;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i<=5; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		sc.close();
		avg = (double)sum/5;
		System.out.println("총점 : "+sum);
		System.out.print("평균 : ");
		System.out.printf("%.1f", avg);

	}

}
