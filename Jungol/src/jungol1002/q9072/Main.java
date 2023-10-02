package jungol1002.q9072;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[10];
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			sum += ar[i];
		}
		sc.close();
		
		avg = (double)sum/ar.length;
		System.out.println("총점 = "+sum);
		System.out.print("평균 = ");
		System.out.printf("%.1f", avg);
		
		

	}

}
