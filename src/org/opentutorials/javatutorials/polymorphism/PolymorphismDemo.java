package org.opentutorials.javatutorials.polymorphism;

interface I {}

class C implements I {}

public class PolymorphismDemo {

	public static void main(String[] args) {
		I obj = new C();
	}

}
