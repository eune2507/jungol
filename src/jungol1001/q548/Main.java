package jungol1001.q548;

public class Main {

	public static void main(String[] args) {
		for(int j = 2; j<=4; j++) {	
			for(int i =1; i<=5; i++) {
				System.out.print(j+" * "+i+" =");
				System.out.printf("%3d", j*i);
				System.out.print("   ");
			}
			System.out.println();
		}

	}

}
