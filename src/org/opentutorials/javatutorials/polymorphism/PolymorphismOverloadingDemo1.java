package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {return "x";}
}
class B extends A {
	public String y() {return "y";}
}

public class PolymorphismOverloadingDemo1 {

	public static void main(String[] args) {
		A obj = new B();
		obj.x();
		//obj.y(); 에러남
	}

}
