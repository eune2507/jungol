package jungol0927.q124;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		if(X==1 |X==3|X==5|X==7|X==8|X==10|X==12) {
			System.out.print("31");
		} else if(X==2) {
			System.out.print("28");
		} else if(X==4|X==6|X==9|X==11) {
			System.out.print("30");
		}

	}

}
