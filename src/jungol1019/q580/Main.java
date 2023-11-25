package jungol1019.q580;

import java.util.Scanner;

public class Main {
	public static boolean mon(int num1, int num2) {
		// 2016년의 날짜 30일 1 4 6 9 11
		// 31일 3 5 7 8 10 12 
		// 29일 2 
		if(num1==1|num1==4|num1==6|num1==9|num1==11) {
			if(num2<=30 && num2>0) {
			return true;
			}
		} else if (num1==3|num1==5|num1==7|num1==8|num1==10|num1==12){
			if(num2<=31 && num2>0) {
				return true;
			}
		} else if (num1==2) {
			if(num2<=29 && num2>0) {
				return true;
			}
		} 
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		
		if(mon(M,d)) {
			System.out.print("OK!");
		} else {
			System.out.print("BAD!");
		}
		
		
	}

}
