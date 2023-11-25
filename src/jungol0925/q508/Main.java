package jungol0925.q508;

public class Main {

	public static void main(String[] args) {
		String[] ar = {"item", "count", "price",
				"pen", "20","100",
				"note", "5", "95",
				"eraser", "110","97" };
//		System.out.printf("%10s%10s%10s\n%10s%10s%10s\n%10s%10s%10s\n%10s%10s%10s",
//				ar[0],ar[1],ar[2],ar[3],ar[4],ar[5],ar[6],ar[7],ar[8],ar[9],ar[10],ar[11]);
		
		for(int i=0;i<ar.length;i=i+3) {
			System.out.printf("%10s%10s%10s\n",ar[i],ar[i+1],ar[i+2]);
		}
		
		
//		System.out.printf("%10s%10s%10s","item","count","price");
//      System.out.println();
//		System.out.printf("%10s%10s%10s","pen","20","100");
//      System.out.println();
//		System.out.printf("%10s%10s%10s","note","5","95");
//      System.out.println();
//		System.out.printf("%10s%10s%10s","eraser","110","97");
	}

}
