package jungol1002.q563;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[10];
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(ar);
		for(int i = 9; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}

}
