package jungol1023.q616;

import java.util.Scanner;
class Xy {
	int x ;
	int y ;
}
public class Main {
	public Main() {
	}

	public double trig(int x1, int x2, int x3) {
		double result = (double) (x1 + x2 + x3) / 3;
		return result;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		Xy xy1 = new Xy();
		Xy xy2 = new Xy();
		Xy xy3 = new Xy();
		xy1.x = sc.nextInt();
		xy1.y = sc.nextInt();
		xy2.x = sc.nextInt();
		xy2.y = sc.nextInt();
		xy3.x = sc.nextInt();
		xy3.y = sc.nextInt();
		sc.close();
		System.out.printf("(%.1f, %.1f)", main.trig(xy1.x,xy2.x,xy3.x), main.trig(xy1.y,xy2.y,xy3.y));

	}

}
