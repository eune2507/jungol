package jungol0925.q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ix = sc.nextDouble();
		sc.close();
		
//		if (ix >= 4) {
//			System.out.println("scholarship");
//		} else if (ix >=3) {
//			System.out.println("next semester");
//		} else if (ix >=2) {
//			System.out.println("seasonal semester");
//		} else {
//			System.out.println("retake");
//		}
//		
		switch ((int)ix) {
		case 4:
			System.out.println("scholarship");
			break;
		case 3:
			System.out.println("next semester");
			break;
		case 2:
			System.out.println("seasonal semester");
			break;
		case 1:
			System.out.println("retake");
			break;
		}
		
	
	}

}
