package jungol0926.q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a!=0 && b!=0) {
			System.out.print(true+" ");
		} else {
			System.out.print(false+" ");
		}
		if(a!=1 || b!=1) {
			System.out.print(true+" ");
		} else {
			System.out.print(false+" ");
		}

	}

}
