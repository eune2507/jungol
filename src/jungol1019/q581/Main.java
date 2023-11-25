package jungol1019.q581;

import java.util.Scanner;

public class Main {
	public int inabs(int num) {
		return Math.abs(num);
	}
	public double douabs(double num) {
		return Math.abs(num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		sc.close();
		Main main = new Main();
		//정수는 절대값이 큰거 실수는 절대값이 작은거 
		if(main.inabs(a)>main.inabs(b)) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		if(main.douabs(x)>main.douabs(y)) {
			System.out.printf("%.2f\n",y);
		} else {
			System.out.printf("%.2f\n",x);
		}

	}

}
