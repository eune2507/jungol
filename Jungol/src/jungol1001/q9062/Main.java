package jungol1001.q9062;

public class Main {

	public static void main(String[] args) {
		
		char a = 'a';
		int b = 1;
		for(int i = 1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(a+" ");
				a++;
			}
			for(int k =5-i; k>=1; k--) {
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}

	}

}
