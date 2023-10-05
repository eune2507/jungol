package jungol1005.q9080;

public class Main {
	public static void main(String[] args) {
		
		int [] ar1 = new int[1];
		int [] ar2 = new int[2];
		int [] ar3 = new int[3];
		int [] ar4 = new int[4];
		int [] ar5 = new int[5];
		
		ar1[0] = 1;
		ar2[0] = 1;
		ar3[0] = 1;
		ar4[0] = 1;
		ar5[0] = 1;
		
		ar2[1] = 1;
		ar3[2] = 1;
		ar4[3] = 1;
		ar5[4] = 1;
		
		ar3[1] = ar2[1] + ar3[0];
		
		ar4[1] = ar3[1] + ar4[0];
		ar4[2] = ar3[2] + ar4[1];
		
		ar5[1] = ar4[1] + ar5[0];
		ar5[2] = ar4[2] + ar5[1];
		ar5[3] = ar4[3] + ar5[2];
		
	}

}
