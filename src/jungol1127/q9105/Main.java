package jungol1127.q9105;

import java.util.Scanner;

public class Main {
	static int ar [] = new int[10];
	static int N;
	public static void number(int Num) {
		if(N==Num) {
			for(int i = 0; i<N; i++	) {
				System.out.print(ar[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i = 1; i<=6; i++) {
			ar[Num]=i;
			number(Num+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		number(0);
	}
}
