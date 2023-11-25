package jungol0927.q121;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		
		if(X==0) {
			System.out.print("zero");
		} else if(X>0) {
			System.out.print("plus");
		} else {
			System.out.print("minus");
		}

	}

}
