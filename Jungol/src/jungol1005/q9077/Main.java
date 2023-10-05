package jungol1005.q9077;

public class Main {

	public static void main(String[] args) {
		int [][] ar = new int[3][3];
		
		ar[0][0] = 3;
		ar[0][1] = 5;
		ar[0][2] = 4;
		ar[1][0] = 2;
		ar[1][1] = 6;
		ar[1][2] = 7;
		ar[2][0] = 8;
		ar[2][1] = 10;
		ar[2][2] = 1;
		
		for(int i = 0; i<ar.length; i++) {
			for(int k = 0; k<ar[i].length; k++) {
				System.out.print(ar[i][k]+ " ");
			}
			System.out.println();
		}
	}

}
