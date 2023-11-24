package jungol1122.q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		sc.close();
		
		for(int i = 0; i<X.length(); i++) {
			if((X.charAt(i)>='A'&&X.charAt(i)<='Z')|(X.charAt(i)>='a'&&X.charAt(i)<='z') ) {
				System.out.print(X.substring(i, i+1).toUpperCase());
			}
		}

	}

}
