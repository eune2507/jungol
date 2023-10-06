package jungol1002.q9071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[10];
		int min = 1000;
		int max = 0;
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i = 0; i<ar.length; i++) {
			if(ar[i]%2==0 && max<ar[i]) {
				max = ar[i];
			} 
			if(ar[i]%2!=0 && min>ar[i]) {
				min = ar[i];
			}
		}

		sc.close();
		System.out.print(min+" "+max);
	}

}
