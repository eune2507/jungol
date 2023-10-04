package jungol1004.q158;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[100];
		int count=0;
		
		for(int i = 0; i <ar.length; i++) {
			ar[i] = sc.nextInt();
			if(ar[i]==0) {
				sc.close();
				break;
			}
			count++;
		}
		
		System.out.println(count);
		
		for(int i = 0; i <count; i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i]/2+" ");
			} else {
				System.out.print(ar[i]*2+" ");
			}
		}
	}

}
