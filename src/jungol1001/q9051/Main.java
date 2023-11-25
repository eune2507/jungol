package jungol1001.q9051;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		for(int i = 1; i<=10; i++) {
			int num = sc.nextInt();
			if(num%2==0) {
				a++;
			}
		}
		sc.close();
		System.out.print("입력받은 짝수는 "+a+"개입니다.");
	}

}
