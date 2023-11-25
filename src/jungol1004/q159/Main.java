package jungol1004.q159;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int ar[] = new int[n];
		
		for(int i = 0; i <ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		for(int i = n-1; i >=0; i--) {
			System.out.println(ar[i]);
		}
		sc.close();

	}

}
