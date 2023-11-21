package jungol1115.q1840;

import java.util.Scanner;

public class Main {
	static int H, R;
	static int cheese [][];
	static int visit [][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		R = sc.nextInt();
		cheese = new int[H][R];
		visit = new int [H][R];
		
		for(int i = 0; i<cheese.length; i++) {
			for(int j = 0; j<cheese[i].length; j++) {
				cheese[i][j] = sc.nextInt();
				visit[i][j] = 0;
			}
		}
		sc.close();
		
		System.out.println("입력된 cheese의 위치");
		for(int i = 0; i<cheese.length; i++) {
			for(int j = 0; j<cheese[i].length; j++) {
				System.out.print(cheese[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("visit 배열의 생김새");
		for(int i = 0; i<cheese.length; i++) {
			for(int j = 0; j<cheese[i].length; j++) {
				System.out.print(visit[i][j]+" ");
			}
			System.out.println();
		}
		
		int time = 0;
		int count = 0;
		
		
		
	}
	public static int count() {
		int cnt = 0;
		for(int i = 0; i<cheese.length;i++) {
			for(int j = 0; j<cheese[i].length; j++) {
				if(cheese[i][j]==0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static boolean cheeseHere() {
		for(int i = 0; i<cheese.length;i++) {
			for(int j = 0; j<cheese[i].length; j++) {
				if(cheese[i][j]==1) {
					return true;
				}
			}
		}
		return false;
	}
	
}

