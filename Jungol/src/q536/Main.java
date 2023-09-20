package q536;

public class Main {
	public static void main(String[] args) {
		int a = 1 ;
		boolean b = true;
		while (b) {
			System.out.print(a + " ");
			a += 1;
			if (a == 16) {
				b = false;
			}
		}
	}
}