package jungol0927.q9032;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int grade = sc.nextInt();
		
		sc.close();
		
		if (grade >=80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("죄송합니다. 불합격입니다.");
		}

	}

}
