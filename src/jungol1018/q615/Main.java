package jungol1018.q615;

import java.util.Scanner;

class Student {
	String name;
	int kor;
	int eng;
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		Student student2 = new Student();
		student1.name = sc.next();
		student1.kor = sc.nextInt();
		student1.eng = sc.nextInt();
		student2.name = sc.next();
		student2.kor = sc.nextInt();
		student2.eng = sc.nextInt();
		sc.close();
		System.out.println(student1.name + " " + student1.kor + " " + student1.eng);
		System.out.println(student2.name + " " + student2.kor + " " + student2.eng);
		System.out.println("avg " + (student1.kor + student2.kor) / 2 + " " + (student1.eng + student2.eng) / 2);

	}

}
