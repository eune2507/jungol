package jungol1019.q9093;

import java.util.Scanner;

public class Main {
	
	public static boolean avg(int num1, int num2, int num3) {
		int avg3 = (num1+num2+num3)/3;
		if(num1<40 | num2<40 | num3<40 | avg3<60) {
			return false;
		} else {
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.print("3과목의 점수를 입력하세요. ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if(avg(a,b,c)) {
			System.out.print("축하합니다. 합격입니다.");
		} else {
			System.out.print("죄송합니다. 불합격입니다.");
		}

	}

}
