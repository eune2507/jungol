package jungol1004.q9074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar [] = new int[10];
		
		for(;;) {
			if(sc.nextInt()==1) {
				ar[0]++;
			} else if(sc.nextInt()==2) {
				ar[1]++;
			} else if(sc.nextInt()==3) {
				ar[2]++;
			} else if(sc.nextInt()==4) {
				ar[3]++;
			} else if(sc.nextInt()==5) {
				ar[4]++;
			} else if(sc.nextInt()==6) {
				ar[5]++;
			} else if(sc.nextInt()==7) {
				ar[6]++;
			} else if(sc.nextInt()==8) {
				ar[7]++;
			} else if(sc.nextInt()==9) {
				ar[8]++;
			} else if(sc.nextInt()==10) {
				ar[9]++;
			}
			if (sc.nextInt()==0){
				sc.close();
				break;
			}	
		}
		
		if(ar[0]>0) {
			System.out.println("1 : "+ar[0]+"개");
		}
		if(ar[1]>0) {
			System.out.println("2 : "+ar[1]+"개");
		}
		if(ar[2]>0) {
			System.out.println("3 : "+ar[2]+"개");
		}
		if(ar[3]>0) {
			System.out.println("4 : "+ar[3]+"개");
		}
		if(ar[4]>0) {
			System.out.println("5 : "+ar[4]+"개");
		}
		if(ar[5]>0) {
			System.out.println("6 : "+ar[5]+"개");
		}
		if(ar[6]>0) {
			System.out.println("7 : "+ar[6]+"개");
		}
		if(ar[7]>0) {
			System.out.println("8 : "+ar[7]+"개");
		}
		if(ar[8]>0) {
			System.out.println("9 : "+ar[8]+"개");
		}
		if(ar[9]>0) {
			System.out.println("10 : "+ar[9]+"개");
		}

	}

}
