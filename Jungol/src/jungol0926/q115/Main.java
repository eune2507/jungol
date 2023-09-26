package jungol0926.q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] Min = new int[2];
		int [] Kiy = new int[2];
		
		for (int i =0;i<Min.length;i++) {
			Min[i]=sc.nextInt();
		}
		for (int i=0;i<Kiy.length;i++) {
			Kiy[i]=sc.nextInt();
		}
		
		sc.close();

		if(Min[0]>Kiy[0] && Min[1]>Kiy[1]) {
			System.out.print(1);
		} else {
			System.out.print(0);
		}
	}

}
