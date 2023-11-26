package jungol1126.q9101;

public class Main {
	static int count = 0;
	public static void name() {
		if(count!=10) {
			System.out.println("홍길동");
			count++;
			name();
		} else {
			
		}
	}
	public static void main(String[] args) {
		name();

	}

}
