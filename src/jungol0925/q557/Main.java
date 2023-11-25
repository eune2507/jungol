package jungol0925.q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] strX = new String[10];
		
		
		//0 3 6
		for (int i = 0; i<strX.length; i++) {
			strX[i] = sc.next();
			if (i % 3 == 0 && i != 9) {
				System.out.print(strX[i]+" ");
			}
		}
		sc.close();
	}

}
