package jungol0927.q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		if (str.charAt(0) == 'M') {
			if (age >= 18) {
				System.out.print("MAN");
			} else {
				System.out.print("BOY");
			}
		} else if(str.charAt(0) == 'F'){
			if (age >= 18) {
				System.out.print("WOMAN");
			} else {
				System.out.print("GIRL");
			}
		}
	}
}
