package jungol1002.q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[10];
		int max = 0; // 100 미만의 수 중 큰 수
		int min = 10000; // 100 이상의 수 중 작은 수
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i<ar.length; i++) {
			if(max<ar[i]&&ar[i]<100) {
				max = ar[i];
			}
			if(min>ar[i]&&ar[i]>=100) {
				min = ar[i];
			}
		}
		if (max==0) {
			max = 100;
		}
		if(min == 10000) {
			min = 100;
		}
		System.out.print(max+" "+min);

	}

}
