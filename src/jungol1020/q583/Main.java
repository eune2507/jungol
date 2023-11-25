package jungol1020.q583;

import java.util.Scanner;

public class Main {
	public double ceil(double num) {
		double result = Math.ceil(num);
		return result;
	}
	public double floor(double num) {
		double result = Math.floor(num);
		return result;
	}
	public double round(double num) {
		double result = Math.round(num);
		return result;
	}
	public double max(double num1, double num2, double num3) {
		if(num1>num2 && num1>num3) {
			return num1;
		} else if(num2>num1 && num2>num3) {
			return num2;
		} else if(num3>num1 && num3>num2) {
			return num3;
		} 
		return 0;
	} 
	public double min(double num1, double num2, double num3) {
		if(num1<num2 && num1<num3) {
			return num1;
		} else if(num2<num1 && num2<num3) {
			return num2;
		} else if(num3<num1 && num3<num2) {
			return num3;
		}
		return 0;
	}
	public double other(double num1, double num2, double num3) {
		double max = 0;
		double min = 0;
		if(num1>num2 && num1>num3) {
			max = num1;
		} else if(num2>num1 && num2>num3) {
			max =  num2;
		} else if(num3>num1 && num3>num2) {
			max = num3;
		} 
		if(num1<num2 && num1<num3) {
			min = num1;
		} else if(num2<num1 && num2<num3) {
			min = num2;
		} else if(num3<num1 && num3<num2) {
			min = num3;
		}
		if (num1!=max && num1!=min) {
			return num1;
		} else if(num2!=max && num2!=min) {
			return num2;
		} else if(num3!=max && num3!=min) {
			return num3;
		}
		return 0;
	}
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		System.out.print((int)main.ceil(main.max(a, b, c))+" ");
		System.out.print((int)main.floor(main.min(a, b, c))+" ");
		System.out.print((int)main.round(main.other(a, b, c))+" ");

	}

}
