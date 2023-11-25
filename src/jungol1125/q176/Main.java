package jungol1125.q176;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		sc.close();
		
		double smA = Math.sqrt(A);
		double smB = Math.sqrt(B);
		
		int inA = (int)smA;
		int inB = (int)smB;
		
//		System.out.println(smA + " " + smB);
//		System.out.println(inA + " " + inB);
		
		if(smA > smB) {
			if(smB - inB > 0) {
				System.out.println(inA - inB);
			} else {
				System.out.println(inA - inB + 1);
			}
		} else if ( smA < smB){
			if(smA - inA > 0) {
				System.out.println(inB - inA);
			}else {
				System.out.println(inB - inA + 1);
			}
		} else {
			System.out.println("1");
		}
	}

}
