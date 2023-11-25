package jungol1001.q546;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=x; i++) {
			int grade = sc.nextInt();
			sum += grade;
		}
		sc.close();
		double avg = (double)sum/x;
		System.out.print("avg : ");
		System.out.printf("%.1f\n", avg);
		if(avg>=80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}
