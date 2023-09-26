package jungol0926.q9025;

public class Main {

	public static void main(String[] args) {
		int a, b, c;
		a = 0;
		b = 1;
		c = 2;
		// 3개의 정수 a, b, c를 선언하여 각각 0, 1, 2로 초기화한 후 
		// a와 b가 모두 참인지, a 또는 b가 참인지, b와 c가 모두 참인지, 
		// a가 참이 아닌지를 확인하여 참이면 1, 거짓이면 0을 각각 출력하는 프로그램을 작성하시오. 
		if (a==1 && b==1) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
		if (a==1 || b==1) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
		if (b==1 && c==1) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
		if (a != 1) {
			System.out.print(1+" ");
		} else {
			System.out.print(0+" ");
		}
	}

}
