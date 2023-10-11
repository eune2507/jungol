package jungol1011.q9086;

import java.util.Scanner;

public class Main {
	public static double avg;
	public Main() {
		
	}
	public double avg(int num1, int num2, int num3) {
		avg = (num1+num2+num3)/3;
		return avg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세과목의 점수를 입력하세요. ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		Main main = new Main();
		main.avg(a, b, c);
		System.out.printf("평균 : %.2f",avg);

	}

}
