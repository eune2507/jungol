package jungol1005.q598;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			char chaX = sc.next().charAt(0);
			
			if(chaX>='A' && chaX<='Z'){
				System.out.println(chaX);
			} else if (chaX>='a' && chaX<='z') {
				System.out.println(chaX);
			} else if(chaX>='0' && chaX<='9') {
				System.out.println((int)chaX);
			} else {
				sc.close();
				break;
			}
		}
	}
}
