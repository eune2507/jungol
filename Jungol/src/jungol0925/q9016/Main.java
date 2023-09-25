package jungol0925.q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		int height = sc.nextInt();
		
		System.out.print("몸무게를 입력하세요. ");
		double kg = sc.nextDouble();
		
		System.out.print("이름을 입력하세요. ");
		String name = sc.next();
		
		sc.close();
		
		System.out.println("키 = "+ height);
		System.out.print("몸무게 = ");
        System.out.printf("%2.1f\n",kg);
		System.out.print("이름 = "+ name);

	}

}
