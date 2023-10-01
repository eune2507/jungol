package jungol1001.q135;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		int min, max;
		if(num1<num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		int sum = 0;
		double avg = 0;
		int a = 0;
		for(int i = min; i<=max; i++) {
			if(i%3==0 || i%5==0) {
				sum += i;
				a++;
			}
		}
		avg = (double)sum/a;
		System.out.println("sum : "+sum);
		System.out.print("avg : ");
		System.out.printf("%.1f",avg);
	}

}
