package jungol1121.q585;

import java.util.Scanner;

public class Main {
	public static void swap(int ar [], int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	public void bubble(int ar[]) {
		for(int i = 1; i < ar.length; i++	) {
			for(int j = 0; j<ar.length-1; j++	) {
				if(ar[j]<ar[j+1]) {
					swap(ar,j,j+1);
				}
			}
			for(int z=0; z<ar.length; z++) {
				System.out.print(ar[z]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int ar [] = new int[10];
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		main.bubble(ar);

	}
	
}
