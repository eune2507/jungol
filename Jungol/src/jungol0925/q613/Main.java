package jungol0925.q613;

import java.util.Scanner;

public class Main {
	
	
//	String inName(String name) {
//		return name;
//	}
//	String inSchool(String school) {
//		return school;
//	}
//	String inGrade(String grade) {
//		return grade;
//	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String strX [] = new String[3];
//		
//		for (int i = 0 ; i < strX.length; i++) {
//			strX[i] = sc.next();
//		}
//		
//		
//		System.out.println("Name : " + strX[0]+ " ");
//		System.out.println("School : "+ strX[1] + " ");
//		System.out.print("Grade : " + strX[2]);
//		
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
//		System.out.println(name);
//		System.out.println(school);
//		System.out.println(grade);
		
		Student stu1 = new Student(name, school, grade);
		stu1.print();
	}

}

class Student {
	private String name;
	private String school;
	private int grade;

	public Student(String name, String school, int grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
	public void print() {
		System.out.println("Name : " + name );
		System.out.println("School : "+ school);
		System.out.println("Grade : "+ grade);
		}
	}
