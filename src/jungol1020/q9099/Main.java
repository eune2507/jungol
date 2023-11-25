package jungol1020.q9099;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void sort(int ar[]) {
		Arrays.sort(ar);
		for(int i = 0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int ar [] = new int[5];
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		main.sort(ar);
	}

}
