package jungol1004.q9076;

public class Main {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 34 55 피보나치수열
		// 0 1 2 3 4 5  6  7  8  9 인덱스
		
		int ar[] = new int[40];
		
		ar[0] = 1;
		ar[1] = 1;
		
		for (int i = 2; i<40; i++) {
			ar[i] = ar[i-2]+ar[i-1];
			
			if((i+1)%10==0 && i!=0) {
				System.out.println("피보나치 수열 "+(i+1)+"항 : "+ar[i]);
			}
		}

	}

}
