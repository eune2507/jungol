package jungol1120.q1303;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int [][] num = new int[H][W];
		int count = 1;
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = count++;
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
