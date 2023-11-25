package jungol1011.q9088;

import java.util.Scanner;

public class Main {
	private int a, c, sol;
	private String b;
	public Main() {
	}

	public void op(int a, String math, int c) {
		this.a = a;
		this.b = math;
		this.c = c;
		switch (math) {
		case "+":
			sol = a + c;
			System.out.print(a + " " + b + " " + c + " = ");
			System.out.print(sol);
			break;
		case "-":
			sol = a - c;
			System.out.print(a + " " + b + " " + c + " = ");
			System.out.print(sol);
			break;
		case "*":
			sol = a * c;
			System.out.print(a + " " + b + " " + c + " = ");
			System.out.print(sol);
			break;
		case "/":
			sol = a / c;
			System.out.print(a + " " + b + " " + c + " = ");
			System.out.print(sol);
			break;
		default:
			sol = 0;
			System.out.print(sol);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int c = sc.nextInt();
		sc.close();
		
		Main main = new Main();
		main.op(a,b,c);
		

	}

}
