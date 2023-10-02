package jungol1002.q153;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[100];
		int a = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == -1) {
				a = i - 1;
				break;
			}
		}
		sc.close();
		if(a<=2) {
			for(int i = 0; i<= a; i++) {
				System.out.print(ar[i] + " ");
			}
		}else {
			for (int i = a - 2; i <= a; i++) {
				System.out.print(ar[i] + " ");
			}
		}
	}
}
