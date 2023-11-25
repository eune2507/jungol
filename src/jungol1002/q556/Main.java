package jungol1002.q556;

public class Main {

	public static void main(String[] args) {
		int ar [] = new int[10];
		
		int num = 1;
		for(int i = 0 ; i < ar.length; i++) {
			ar[i] =num;
			num++;
		}
		
		for(int i = 0 ; i <ar.length; i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
