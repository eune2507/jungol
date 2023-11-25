package jungol1010.q163;

public class Main {

	public static void main(String[] args) {
		int ar [][]= {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		int sum = 0;
		for(int i = 0; i <ar.length; i++) {
			for(int k = 0; k<ar[i].length; k++) {
				System.out.print(ar[i][k]+" ");
				sum += ar[i][k];
			}
			System.out.println();
		}
		System.out.println(sum);
		
		

	}

}
