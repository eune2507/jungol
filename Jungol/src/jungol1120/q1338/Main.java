package jungol1120.q1338;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		char [][] alpha = new char[N][N];
		char X = 'A';
		// [0,4] [1,3] [2,2] [3,1] [4,0] 
		// 		 [1,4] [2,3] [3,2] [4,1]
		//			   [2,4] [3,3] [4,2]
		//					 [3,4] [4,3]
		//						   [4,4]
		for(int i = 0; i<alpha.length; i++) {
			int a = i;
			for(int j = N-1; j>=i; j--) {
				if(X>'Z') {
					X='A';
				}
				alpha[a++][j] = X++;
			}
		}
		for(int i =0; i<alpha.length; i++) {
			for(int z = 1; z<N-i; z++) {
				System.out.print(" "+" ");
			}
			for(int j = N-1-i; j<N; j++) {
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}

	}

}
