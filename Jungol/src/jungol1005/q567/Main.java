package jungol1005.q567;

public class Main {

	public static void main(String[] args) {
		int [][] ar = new int[3][5];
		
		ar[0][0] = 5;
		ar[0][1] = 8;
		ar[0][2] = 10;
		ar[0][3] = 6;
		ar[0][4] = 4;
		ar[1][0] = 11;
		ar[1][1] = 20;
		ar[1][2] = 1;
		ar[1][3] = 13;
		ar[1][4] = 2;
		ar[2][0] = 7;
		ar[2][1] = 9;
		ar[2][2] = 14;
		ar[2][3] = 22;
		ar[2][4] = 3;
		
		for (int i = 0 ; i <ar.length; i++) {
			for(int j = 0 ; j < ar[i].length; j++) {
				System.out.printf("%2d   ", ar[i][j]);
			}
			System.out.println();
		}
	}
}
