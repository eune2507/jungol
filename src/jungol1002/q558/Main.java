package jungol1002.q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar [] = new int[100];
		
		int a = 0;
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if(ar[i]==0) {
				a--;
				break;
			}
			a++;
		}
		sc.close();
		for(int i = a; i>=0; i--) {
			System.out.print(ar[i]+" ");
		}

	}

}
