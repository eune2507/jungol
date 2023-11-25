package jungol1024.q9130;

import java.util.Scanner;

class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge()	{
		return age;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.next();
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt();
		Person person = new Person(name, age);
		sc.close();
		System.out.print("당신의 이름은 "+person.getName()+"이고 나이는 "+person.getAge()+"세이군요.");

	}

}
