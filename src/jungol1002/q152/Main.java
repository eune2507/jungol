package jungol1002.q152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = new int[10];
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0 ; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			if(i%2==1) {
				even += ar[i];
			} else {
				odd += ar[i];
			}
		}
		sc.close();
		System.out.println("odd : "+odd);
		System.out.println("even : "+even);
		

	}

}
