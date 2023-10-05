package jungol1005.q9079;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] ar = new int[4][4];

		for (int i = 0; i < ar.length - 1; i++) {
			System.out.print((i + 1) + "번째 학생의 점수 ");
			for (int k = 0; k < ar[i].length - 1; k++) {
				ar[i][k] = sc.nextInt();
				ar[i][3] += ar[i][k];
				ar[3][k] += ar[i][k];
				ar[3][3] += ar[i][k];
			}
		}
		sc.close();
		System.out.println("     국어 영어 수학 총점");
		for (int i = 0; i < ar.length; i++) {
			if (i < 3) {
				System.out.printf("%2s번%4d%4d%4d%4d\n", (i + 1), ar[i][0], ar[i][1], ar[i][2], ar[i][3]);
			} else {
				System.out.printf("합계%4d%4d%4d%4d",  ar[i][0], ar[i][1], ar[i][2], ar[i][3]);
			}
		}

	}

}
