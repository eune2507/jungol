package jungol1006.q570;

public class Main {
	public static void main(String[] args) {
		
		int [][] ar = new int[5][5];
		
		for(int i = 0; i < ar.length; i++) {
			ar[0][i] = 1;
			ar[i][0] = 1;
		}
		
		for(int i = 1; i < ar.length; i++) {
			for(int j = 1; j < ar[i].length; j++) {
				ar[i][j] = ar[i-1][j] + ar[i][j-1];
			}
		}
		
		for(int i = 0 ; i < ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
