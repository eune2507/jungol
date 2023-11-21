package jungol1120.q5932;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int [][] num = new int[N][N];
		for(int i = 0; i<num.length; i++) {
			int count = 1;
			if(i%2==0 | i==0) {
				for(int j = 0; j<num[i].length; j++) {
					num[i][j] = count++;
				}
			} else {
				for(int j = N-1; j>=0; j--) {
					num[i][j] = count++;
				}
			}
		}
		
		for(int i = 0; i<num.length; i++) {
			for (int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
