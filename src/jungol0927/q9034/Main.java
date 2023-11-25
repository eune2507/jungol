package jungol0927.q9034;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		
		sc.close();
		
		if(dice1>=4 && dice2>=4) {
			System.out.print("이겼습니다.");
		} else if(dice1<4 && dice2<4) {
			System.out.print("졌습니다.");
		} else {
			System.out.print("비겼습니다.");
		}

	}

}
