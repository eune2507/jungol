package jungol1002.q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[10];
		int sum1 = 0;
		int sum2 = 0;
		double avg = 0;
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if(i%2==1) {
			sum1 += ar[i];
			} else {
				sum2 += ar[i];
			}
		}
		sc.close();
		avg = (double)sum2/5;
		
		System.out.println("sum : "+sum1);
		System.out.print("avg : ");
		System.out.printf("%.1f", avg);

	}

}
