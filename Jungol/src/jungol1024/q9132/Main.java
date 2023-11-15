package jungol1024.q9132;

import java.util.Scanner;

class Student {
	private String name;
	private int kor;
	private int eng;
	
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		Student student2 = new Student(sc.next(), sc.nextInt(), sc.nextInt());
		sc.close();
		
		System.out.println(student1.getName()+" "+student1.getKor()+" "+student1.getEng());
		System.out.println(student2.getName()+" "+student2.getKor()+" "+student2.getEng());
		System.out.println("합계 "+(student1.getKor()+student2.getKor())+" "+(student1.getEng()+student2.getEng()));
		

	}

}
