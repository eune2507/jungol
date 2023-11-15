package jungol1024.q9131;

import java.util.Scanner;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
		String name = sc.next();
		int age = sc.nextInt();
		String myName = "손예준";
		int myAge = 12;
		sc.close();
		Person friend = new Person(name, age);
		Person my = new Person(myName, myAge);
		
		System.out.println("당신의 이름 : "+my.getName()+", 나이 : "+my.getAge());
		System.out.println("친구의 이름 : "+friend.getName()+", 나이 : "+friend.getAge());
	}

}
