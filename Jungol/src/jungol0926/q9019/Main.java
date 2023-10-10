package jungol0926.q9019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5개의 수를 입력하시오. ");
		int a = sc.nextInt()+3;
		int b = sc.nextInt()-3;
		int c = sc.nextInt()*3;
		int d = sc.nextInt()/3;
		int e = sc.nextInt()%3;
		sc.close();
	
		System.out.printf("%d %d %d %d %d",a,b,c,d,e);

	}

}
