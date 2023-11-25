package jungol0922.q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bplay = true;
		
		int sum = 0;
		int i = 1;
		
		while (bplay) {
			
			int num = sc.nextInt();
			sum += num;
			double average = (double) sum / i;
			
			if (num >= 100) {
				
				bplay = false;
				System.out.println(sum);
				System.out.printf("%.1f", average);
				
			} else if (num < 100) {
				
				i++;
			}
		}
		sc.close();

	}

}
