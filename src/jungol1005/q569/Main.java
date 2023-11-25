package jungol1005.q569;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] ar = new int[5][4];
		
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		int avg = 0;
		int pass = 0;
		for(int i = 0; i < ar.length; i++) {
			for(int j = 0; j <ar[i].length; j++) {
				sum += ar[i][j];
			}
			avg = sum/4;
			if(avg>=80) {
				pass++;
				System.out.println("pass");
			} else {
				System.out.println("fail");
			}
			avg = 0;
			sum = 0;
		}
		sc.close();
		System.out.println("Successful : "+pass);
		
	}

}
