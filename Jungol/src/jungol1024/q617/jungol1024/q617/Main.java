package jungol1024.q617.jungol1024.q617;

import java.util.Scanner;

class Compare {
	private Person[] p;

	public Compare(String name1, int height1, String name2, int height2, String name3, int height3, String name4,
			int height4, String name5, int height5) {
		p = new Person[5];
		p[0] = new Person(name1, height1);
		p[1] = new Person(name2, height2);
		p[2] = new Person(name3, height3);
		p[3] = new Person(name4, height4);
		p[4] = new Person(name5, height5);
	}
	public void getMin() {
		int min = 1000;
		for(int i = 0; i<p.length; i++) {
			if(min>p[i].getHeight()) {
				min = p[i].getHeight();
			}
		}
		for(int i = 0; i < p.length; i++) {
			if(min==p[i].getHeight()) {
				System.out.print(p[i].getName()+" "+p[i].getHeight());
			}
		}
	}
}

class Person {
	private String name;
	private int height;

	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int height1 = sc.nextInt();
		String name2 = sc.next();
		int height2 = sc.nextInt();
		String name3 = sc.next();
		int height3 = sc.nextInt();
		String name4 = sc.next();
		int height4 = sc.nextInt();
		String name5 = sc.next();
		int height5 = sc.nextInt();
		sc.close();
		Compare com = new Compare(name1, height1, name2, height2, name3, height3, name4, height4, name5, height5);
		
		com.getMin();
	}

}
