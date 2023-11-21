package jungol1120.q1339;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if (N % 2 == 0 | N>100) {
			System.out.print("INPUT ERROR");
		} else {
			char[][] alpha = new char[N][N];
			char X = 'A';

			int num = N /2;
			int cnt = 1;
			alpha[num][num] = X++;
			for (int i = num - cnt; i >= 0; i--) {
				for (int j = num - cnt; j <= num + cnt; j++) {
					if(X>'Z') {
						X='A';
					}
					alpha[j][i] = X++;
				}
				cnt++;
			}

			for(int i = 0; i<num; i++) {
				for(int j = 0; j<=i; j++) {
					System.out.print(alpha[i][j]+" ");
				}
				for(int z = N-i-1; z>0; z--) {
					System.out.print(" "+" ");
				}
				System.out.println();
			}
			cnt = num;
			for(int i = num; i<N; i++) {
				for(int j = 0; j<=cnt; j++) {
					System.out.print(alpha[i][j]+" ");
				}
				for(int z =N-i; z<N; z++) {
					System.out.print(" "+ " ");
				}
				cnt--;
				System.out.println();
			}
		}
	}

}
