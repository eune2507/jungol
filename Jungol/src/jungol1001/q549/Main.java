package jungol1001.q549;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int a = 0;
		
		for(int i = 1; sum<num; i++) {
			if(i%2==1) {
				a++;
				sum += i;
			}
		}
		System.out.print(a+" "+sum);

	}

}
