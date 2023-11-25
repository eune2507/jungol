package jungol0927.q9031;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int min, max;
		if (a > b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}

		System.out.print("입력받은 수 중 큰 수는 " + max + "이고 작은 수는 " + min + "입니다.");

	}

}
