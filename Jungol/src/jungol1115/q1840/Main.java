package jungol1115.q1840;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int cheese[][] = new int[height][width];
		int visit[][] = new int[height][width];
		for (int i = 0; i < cheese.length; i++) {
			for (int j = 0; j < cheese[i].length; j++) {
				cheese[i][j] = sc.nextInt();
				visit[i][j] = 0;
			}
		}
		// 치즈공기구멍 파악
		for (int i = 1; i < cheese.length - 1; i++) {
			for (int j = 1; j < cheese[i].length - 1; j++) {
				int count = 0;
				if (cheese[i][j] == 0) {
					for (int z = j + 1; z < cheese[i].length; z++) {
						if (cheese[i][z] == 1) {
							count++;
							break;
						}
					}
					for (int z = i + 1; z < cheese.length; z++) {
						if (cheese[z][j] == 1) {
							count++;
							break;
						}
					}
					for (int z = j - 1; z >= 0; z--) {
						if (cheese[i][z] == 1) {
							count++;
							break;
						}
					}
					for (int z = i - 1; z >= 0; z--) {
						if (cheese[z][j] == 1) {
							count++;
							break;
						}
					}
					if (count >= 4) {
						cheese[i][j] = 5;
					}
				}
			}
		}
		
		int cheesecount = 0;
		int time = 0;
		int lastcheese = 0;
		while (cheesecount < height * width) {
			System.out.println("TIME : " + time);
			System.out.println("cheese");
			System.out.println(" ");
			for (int i = 0; i < cheese.length; i++) {
				for (int j = 0; j < cheese[i].length; j++) {
					System.out.print(cheese[i][j] + " ");
				}
				System.out.println();
			}
			for (int i = 0; i < cheese.length; i++) {
				for (int j = 0; j < cheese[i].length; j++) {
					if(cheese[i][j]==0) {
						visit[i][j] = 1;
					}
				}
			}
			System.out.println("visit 공기공기");
			for (int i = 0; i < cheese.length; i++) {
				for (int j = 0; j < cheese[i].length; j++) {
					System.out.print(visit[i][j] + " ");
				}
				System.out.println();
			}
			cheesecount = 0;
			lastcheese = 0;

			// 치즈 외부노출 2로 바꿈
			for (int i = 1; i < cheese.length - 1; i++) {
				for (int j = 1; j < cheese[i].length - 1; j++) {
					if (cheese[i][j] == 1) {
						if (cheese[i][j - 1] == 0 | cheese[i][j + 1] == 0 | cheese[i + 1][j] == 0
								| cheese[i - 1][j] == 0) {
							cheese[i][j] = 2;
						}
					}
				}
			}
			System.out.println(" ");
			System.out.println("cheese 2인거 확인하기");
			for (int i = 0; i < cheese.length; i++) {
				for (int j = 0; j < cheese[i].length; j++) {
					System.out.print(cheese[i][j] + " ");
				}
				System.out.println();
			}
			
			for (int i = 1; i < cheese.length - 1; i++) {
				for (int j = 1; j < cheese[i].length - 1; j++) {
					if (cheese[i][j] == 5) {
						if(cheese[i][j - 1] == 2 | cheese[i][j + 1] == 2 | cheese[i + 1][j] == 2
								| cheese[i - 1][j] == 2) {
							cheese[i][j] = 0;
						}
					}
				}
			}
			
			// 외부노출친구 사르르
			for (int i = 1; i < cheese.length - 1; i++) {
				for (int j = 1; j < cheese[i].length - 1; j++) {
					if (cheese[i][j] == 2) {
						lastcheese++;
						cheese[i][j] = 0;
					}
				}
			}
			// 구멍 다시 0으로 돌리기 구멍마다 돌리는거로 바꿔야함
			// 시간 증가
			time += 1;
			// cheesecount 가 배열의 갯수만큼이면 반복문 종료
			for (int i = 0; i < cheese.length; i++) {
				for (int j = 0; j < cheese[i].length; j++) {
					if (cheese[i][j] == 0) {
						cheesecount++;
					}
				}
			}
		}
		System.out.println(" ");
		System.out.println("cheese 마지막 확인하기");
		for (int i = 0; i < cheese.length; i++) {
			for (int j = 0; j < cheese[i].length; j++) {
				System.out.print(cheese[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(time);
		System.out.println(lastcheese);
	}

}

