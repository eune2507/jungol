package jungol0927.q9036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 삽입");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.print("숫자를 선택하세요. ");
		int X = sc.nextInt();
		sc.close();
		
		if(X==1) {
			System.out.print("삽입을 선택하셨습니다.");
		} else if(X==2) {
			System.out.print("수정을 선택하셨습니다.");
		} else if(X==3) {
			System.out.print("삭제를 선택하셨습니다.");
		}

	}

}
