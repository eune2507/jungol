package jungol0926.q119;

public class Main {
	public static void main(String[] args) {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		
		int a = 0;
		int b = 0;
		int c = 0;
		a = cal.get(java.util.Calendar.YEAR)-1900 ;
		b = a + cal.get(java.util.Calendar.MONTH);
		c = b +cal.get(java.util.Calendar.DATE);
		
		System.out.printf("%d %d %d", c, b, a);
	}
}
