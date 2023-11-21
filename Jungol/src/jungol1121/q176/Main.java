package jungol1121.q176;

import java.util.Scanner;

public class Main {
	public static double rut(double num) {
		double result = Math.sqrt(num);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		double ruta = Math.floor(rut(a));
		System.out.println(rut(a));
		System.out.println(ruta);
		double rutb = Math.floor(rut(b));
		System.out.println(rut(b));
		System.out.println(rutb);
		double result = 0;
		if(ruta > rutb) {
			result = ruta - rutb - 1;
			System.out.println(result);
		} else {
			result = rutb - ruta - 1;
			System.out.println(result);
		}
		if(rut(a)-ruta == 0) {
			result ++;
		}
		if(rut(b) - rutb == 0) {
			result ++;
		}
		System.out.print((int)result);		

	}

}
