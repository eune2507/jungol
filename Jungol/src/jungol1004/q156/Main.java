package jungol1004.q156;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[] = new int[100];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == 999) {
				sc.close();
				break;
			}
			count++;
		}

		Arrays.sort(ar);
		int max = 0, min = 0;
		if (ar[0] >= 0) {
			max = ar[98];
			min = ar[99 - count];
		} else if (ar[0] < 0) {
			min = ar[0];
			if (ar[98] == 0) {
				max = ar[count-1];
			} else {
				max = ar[98];
			}
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);

	}

}
