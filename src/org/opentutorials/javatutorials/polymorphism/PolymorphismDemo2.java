package org.opentutorials.javatutorials.polymorphism;

interface I2 {
	public String A();
}
interface I3 {
	public String B();
}

class D implements I2, I3 {
	public String A() {
		return "A";
	}
	public String B() {
		return "B";
	}
}

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		D obj = new D();
	}

}
