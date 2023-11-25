package jungol1020.q584;

public class Main {
	public void fx() {
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				System.out.println(i+" + "+j+" = "+(i+j));
			}
		}
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.fx();
	}

}
