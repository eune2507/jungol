package jungol1002.q9069;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
		System.out.print("YEAR = ");
		int year = sc.nextInt();
		System.out.print("MONTH = ");
		int month = sc.nextInt();

		int days = 0;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;
			System.out.println("입력하신 달의 날 수는 " + days + "일입니다.");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
			System.out.println("입력하신 달의 날 수는 " + days + "일입니다.");
		} else if (month == 2) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				days = 29;
				System.out.println("입력하신 달의 날 수는 " + days + "일입니다.");
			} else {
				days = 28;
				System.out.println("입력하신 달의 날 수는 " + days + "일입니다.");
			}
		} else if (month == 0) {
			sc.close();
			break;
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		System.out.println();
		}
	}

}
