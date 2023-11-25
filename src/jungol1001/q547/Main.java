package jungol1001.q547;

public class Main {

	public static void main(String[] args) {
		int a = 2;
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print(a+" ");
				a++;
			}
			a -= 4;
			System.out.println();
		}

	}

}
