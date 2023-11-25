package jungol1001.q131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		
		if(num1<num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
		for(int i = min; i<=max; i++) {
			System.out.print(i+" ");
		}

	}

}
