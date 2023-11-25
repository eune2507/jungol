package jungol0927.q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bplay = true;
		while(bplay) {
			int X = sc.nextInt();
			if(X%3==0) {
				System.out.println(X/3);
			} else if (X == -1) {
				sc.close();
				break;
			}
		}
	}

}
