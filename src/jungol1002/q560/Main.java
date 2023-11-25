package jungol1002.q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[10];
		int min = 1000;
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i<ar.length; i++) {
			if(min>ar[i]) {
				min = ar[i];
			}
		}
		System.out.print(min);
	}

}
