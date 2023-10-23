package jungol1019.q579;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int ar [];
	public static void ar(int [] ar) {
		Arrays.sort(ar);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ar = new int[N];
		for (int i = 0; i<N; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		ar(ar);
		for(int i =N-1; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}

	}

}
