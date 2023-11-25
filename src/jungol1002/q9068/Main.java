package jungol1002.q9068;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[100];
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if(ar[i]==0) {
				break;
			}
		}
		sc.close();
		
		for(int i = 0; i<ar.length; i++) {
			if(i%2==1 && ar[i]!=0) {
				System.out.print(ar[i]+" ");
			}
		}
	}

}
