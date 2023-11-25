package jungol1005.q566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[100];
		
		ar[0] = 100;
		ar[1] = sc.nextInt();
		sc.close();
		for(int i = 2; i < ar.length; i++) {
			ar[i] = ar[i-2] - ar[i-1];
			if(ar[i-2]< 0 ) {
				System.out.print(ar[i-2]+" ");
				break;
			}
			System.out.print(ar[i-2]+" ");
		}

	}

}
