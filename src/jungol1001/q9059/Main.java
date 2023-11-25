package jungol1001.q9059;

public class Main {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j = 4; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			for(int z = 1; z<i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
