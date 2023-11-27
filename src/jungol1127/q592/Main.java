package jungol1127.q592;

import java.util.Scanner;

public class Main {
	static int count = 0;
	static int sum = 0;
	public static void number(String N) {
		if(count<N.length()) {
			int num = Integer.parseInt(N.substring(count,count+1));
			sum += Math.pow(num, 2);
			count++;
			number(N);
		} else {
			System.out.print(sum);
		}
	}
	public static void main(String[] args) {
//		 ( main()함수에 변수 하나, 재귀함수에 매개변수 하나만을 사용할 수 있다.)
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		number(N);
	}

}
