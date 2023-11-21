package jungol1120.q1307;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char [][] alpha = new char[N][N];
		sc.close();
		
		char X = 'A';
		
		for(int i = N-1; i>=0; i--) {
			for(int j = N-1; j>=0; j--) {
				if(X>'Z') {
					X='A';
				}
				alpha[j][i] = X++;
			}
		}
		for(int i = 0; i<alpha.length;i++) {
			for(int j = 0; j<alpha[i].length; j++) {
				System.out.print(alpha[i][j]+" ");
			}
			System.out.println();
		}
	}

}
