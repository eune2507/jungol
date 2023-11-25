package jungol0925.q614;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student stu2 = new Student("Jejuelementary", 6);
		stu2.print();
		
		Student stu1 = new Student(school, grade);
		stu1.print();
		
	}

}

class Student {
	String school;
	int grade;
	
	public Student(String school, int grade) {
		this.school = school;
		this.grade = grade;
	}
	public void print() {
		System.out.println(grade+" grade in "+school+" School");
	}
}