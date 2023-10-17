package jungol1017.q578;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int max, min;
		if(a>b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}	
		for(;min<=max;min++) {
			System.out.println("== "+min+"dan ==");
			for(int i = 1; i<10; i++) {
				System.out.print(min+" * "+i+" =");
				System.out.printf("%3s\n", min*i);
			}
			System.out.println();
		}

	}

}
