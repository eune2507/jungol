package jungol1120.q5931;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int [][]num = new int[N][N];
		int count = 1;
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				num[i][j] = count;
			}
			count++;
		}
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
