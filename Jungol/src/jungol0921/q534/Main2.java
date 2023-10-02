package jungol0921.q534;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);
		sc.close();
		if (grade==65) {
			System.out.println("Excellent");
		} else if (grade==66) {
			System.out.println("Good");
		} else if (grade==67) {
			System.out.println("Usually");
		} else if (grade==68) {
			System.out.println("Effort");
		} else if (grade==70) {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}
	}
}
