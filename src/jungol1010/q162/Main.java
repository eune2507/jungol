package jungol1010.q162;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		
		int ar [] = new int[10];
		ar[0] = A;
		ar[1] = B;
		for(int i = 2; i<ar.length; i++) {
			ar[i] = (ar[i-2]+ar[i-1])%10;
		}
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
