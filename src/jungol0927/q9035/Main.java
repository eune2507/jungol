package jungol0927.q9035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 수를 입력하세요. ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		sc.close();
		
		if(x>y && x>z) {
			System.out.print("입력받은 수중 가장 큰 수는 "+x+"입니다.");
		} else if(y>x && y>z) {
			System.out.print("입력받은 수중 가장 큰 수는 "+y+"입니다.");
		} else if(z>x && z>y) {
			System.out.print("입력받은 수중 가장 큰 수는 "+z+"입니다.");
		}
	}
}
