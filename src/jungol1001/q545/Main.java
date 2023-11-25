package jungol1001.q545;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a3 = 0;
		int a5 = 0;
		
		for(int i = 1; i<=10; i++) {
			int num = sc.nextInt();
			if(num%3==0) {
				a3++;
			}
			if(num%5==0) {
				a5++;
			}
		}
		sc.close();
		System.out.println("Multiples of 3 : "+a3);
		System.out.println("Multiples of 5 : "+a5);

	}

}
