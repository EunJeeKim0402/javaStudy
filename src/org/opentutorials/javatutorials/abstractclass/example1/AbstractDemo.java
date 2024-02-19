package org.opentutorials.javatutorials.abstractclass.example1;


abstract class A {
	public abstract int b();
	// 본체가 있는 메소드는 추상 키워드를 가질 수 없음
	//public abstract int c() {
		//System.out.println("Hi");
	//}
	// 추상클래스 내에는 추상 아닌 메소드가 존재할 수 잇음
	public void d() {
		System.out.println("hello");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		//A obj = new A();
		B obj = new B();
	}

}
