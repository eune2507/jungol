package jungol1002.q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strX[] = new String[10];
		
		for(int i = 0; i<strX.length; i++) {
			strX[i]=sc.next();
		}
		sc.close();
		for(int i = strX.length-1; i>=0;i--) {
			System.out.print(strX[i]+" ");
		}

	}

}
