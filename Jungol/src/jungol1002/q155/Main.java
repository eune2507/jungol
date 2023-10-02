package jungol1002.q155;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String strX [] = {"J","U","N","G","O","L"};
		
		String str = sc.next();
		
		for(int i = 0; i<strX.length; i++) {
			if(strX[i]== str) {
				System.out.print(i);
			} else {
				System.out.print("none");
			}
			
		}
		
	}

}
