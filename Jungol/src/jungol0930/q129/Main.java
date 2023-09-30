package jungol0930.q129;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.print("Base = ");
			int base = sc.nextInt();
			System.out.print("Height = ");
			int height = sc.nextInt();
			System.out.print("Triangle width = ");
			System.out.printf("%.1f\n", (double)base*height/2);
			
			System.out.print("Continue? ");
			String str = sc.next();

			char cha = str.charAt(0);
			
			if(cha =='Y'||cha=='y') {
				continue;
			} else {
				sc.close();
				break;
			}
		}

	}

}
