package jungol1001.q9057;

public class Main {

	public static void main(String[] args) {
		for(int i =1; i<=3; i++) {
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =3; i>=1; i--) {
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
