package jungol1024.q9134;

import java.util.Scanner;
class Sen {
	
	public double sen(int x1, int x2) {
		double result = (double)(x1+x2)/2;
		return result;
	}
}
class Xy {
	private int x, y;
	
	public Xy(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점의 좌표는?(x, y) ");
		Xy xy1 = new Xy(sc.nextInt(), sc.nextInt());
		System.out.print("점의 좌표는?(x, y) ");
		Xy xy2 = new Xy(sc.nextInt(), sc.nextInt());
		sc.close();
		Sen sen = new Sen();
		System.out.printf("중심점의 위치 = (%.1f, %.1f)",sen.sen(xy1.getX(), xy2.getX()), sen.sen(xy1.getY(), xy2.getY()));
	}

}
