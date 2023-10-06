package jungol1006.q160;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[6];
		
		for(int i = 0; i<10; i++) {
			int num = sc.nextInt();
			if(num==1) {
				ar[0]++;
			} else if (num==2) {
				ar[1]++;
			} else if (num==3) {
				ar[2]++;
			} else if (num==4) {
				ar[3]++;
			} else if (num==5) {
				ar[4]++;
			} else if (num==6) {
				ar[5]++;
			}
		}
		sc.close();
		for(int i = 0; i <ar.length; i++) {
			System.out.println((i+1)+" : "+ar[i]);
		}	
	}
}
