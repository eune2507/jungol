package jungol0930.q9045;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요. ");
			int num = sc.nextInt();

			System.out.println();
			switch (num) {
			case 1:
				System.out.println("입력하기를 선택하였습니다.");
				break;
			case 2:
				System.out.println("출력하기를 선택하였습니다.");
				break;
			case 3:
				System.out.println("삭제하기를 선택하였습니다.");
				break;
			case 4:
				System.out.print("끝내기를 선택하였습니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다. ");
			}
			System.out.println();
			if (num == 4) {
				sc.close();
				break;
			}
		}

	}

}
