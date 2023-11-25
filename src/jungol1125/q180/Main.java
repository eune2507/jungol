package jungol1125.q180;

import java.util.Scanner;

public class Main {
	static int num [] = new int[7];
	public static void change() {
		for(int i = 0; i<6; i++) {
			int a = num[i];
			int b = num[i+1];
			if(a>b) {
				num[i+1] = a;
				num[i] = b;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<7; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		change();
		change();
		change();
		
		for(int i = 0; i<7; i++) {
			System.out.print(num[i]+" ");
		}

	}

}
