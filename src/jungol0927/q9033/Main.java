package jungol0927.q9033;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. ");
		int grade = sc.nextInt();
		sc.close();
		
		if(grade>=90) {
			System.out.print("A");
		} else if(grade>=80) {
			System.out.print("B");
		} else if(grade>=70) {
			System.out.print("C");
		} else if(grade>=60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}

	}

}
