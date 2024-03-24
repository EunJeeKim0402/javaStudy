package org.opentutorials.javatutorials.progenitor;

class Human {
	protected String test() {
		return "test";
	}
}

class Student extends Human implements Cloneable {
	String name;
	Student(String name) {
		this.name = name;
	}
}

public class ObjectDemo2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("egoing");
		//s1.clone(); // 복제 가능하다는 인터페이스를 구현해야됨
		s1.test();

	}

}
