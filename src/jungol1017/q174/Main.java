package jungol1017.q174;

import java.util.Scanner;

public class Main {
	public static int ar[][] = new int[3][3];
	public static int sum(int a) {
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += ar[a][i];
		}
		return sum;
	}
	public static int sum1(int a) {
		int sum = 0;
		for(int i = 0; i<3; i++) {
			sum += ar[i][a];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++	) {
			for(int k = 0; k<3; k++) {
				ar[i][k] = sc.nextInt();
			}
		}
		sc.close();
		for(int i = 0; i<3; i++) {
			for(int k = 0; k<3; k++) {
				System.out.print(ar[i][k]+" ");
			}
			System.out.println(sum(i));
		}
		int sum2 = 0;
		for(int i = 0; i<3; i++) {
			System.out.print(sum1(i)+" ");
			sum2 += sum1(i);
			if(i==2) {
				System.out.print(sum2);
			}
		}
	}
}
