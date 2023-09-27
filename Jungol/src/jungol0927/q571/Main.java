package jungol0927.q571;

import java.util.Scanner;

public class Main {
//	case 1
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = "~!@#$^&*()_+|";
//		int x = sc.nextInt();
//		sc.close();
//		
//		
//		for (int i = 1; i <= x; i++) {
//			System.out.println(str);
//		}
//	}
//
//}

//	case 2 -----------------------------------------
	public void print() {
		System.out.println("~!@#$^&*()_+|");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		Main m = new Main(); // Main 클래스의 인스턴스 만들기

		for (int i = 0; i < num; i++) {
			m.print();
		}
	}
}
