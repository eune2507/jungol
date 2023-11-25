package jungol1121.q175;

import java.util.Scanner;

public class Main {
	static int ar [];
	public static void swap(int ar [], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	public static void bubble(int ar[]) {
		for(int i = 1; i < ar.length; i++	) {
			for(int j = 0; j<ar.length-1; j++	) {
				if(ar[j]<ar[j+1]) {
					swap(ar,j,j+1);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ar = new int[N];
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		bubble(ar);
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
