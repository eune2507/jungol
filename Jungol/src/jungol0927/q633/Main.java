package jungol0927.q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean bplay = true;

		while (bplay) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");

			int num = sc.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				System.out.println("Seoul");
				break;
				
			case 2:
				System.out.println("Washington");
				break;
				
			case 3:
				System.out.println("Tokyo");
				break;
				
			case 4:
				System.out.println("Beijing");
				break;
				
			default:			
				System.out.print("none");
				sc.close();
				bplay = false;
			}
			System.out.println();
		}
	}

}
