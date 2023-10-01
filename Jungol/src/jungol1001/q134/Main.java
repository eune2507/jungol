package jungol1001.q134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int even = 0;
		int odd = 0;
		for(int i = 1; i<=10; i++) {
			int num = sc.nextInt();
			if(num%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		sc.close();
		System.out.println("even : "+even);
		System.out.println("odd : "+odd);

	}

}
