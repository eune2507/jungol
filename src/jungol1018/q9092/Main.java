package jungol1018.q9092;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void sort(int[]ar)	{
		Arrays.sort(ar);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[6];
		for(int i = 0; i < 6; i++) {
			ar[i] = sc.nextInt();
		}
		sort(ar);
		for(int i = 0 ; i < 6; i++) {
			System.out.print(ar[i] + " ");
		}
		sc.close();	
	}
}
