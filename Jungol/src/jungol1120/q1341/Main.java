package jungol1120.q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		if(A>B) {
			for(int i = A; i>=B; i--) {
				for(int j = 1; j<=3; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				for(int j = 4; j<=6; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				for(int j = 7; j<=9; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				System.out.println();
			}
		} else {
			for(int i = A; i<=B; i++) {
				for(int j = 1; j<=3; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				for(int j = 4; j<=6; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				for(int j = 7; j<=9; j++) {
					System.out.printf("%-2d* %-2d=%3d   ", i,j,i*j);
				}
				System.out.println();
				System.out.println();
			}
		}

	}

}
