package jungol0927.q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int pkg	= sc.nextInt();
		sc.close();
		
		int bmi = pkg + 100 - height;
		System.out.println(bmi);
		if (bmi >0) {
			System.out.println("Obesity");
		}

	}

}
