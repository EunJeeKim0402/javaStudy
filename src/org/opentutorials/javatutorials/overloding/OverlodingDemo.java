package org.opentutorials.javatutorials.overloding;

public class OverlodingDemo {
	
	void A () {System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A(int arg1)");}
	void A (String arg1) {System.out.println("void A(String arg1)");}

	public static void main(String[] args) {

		OverlodingDemo od = new OverlodingDemo();
		od.A();
		od.A(1);
		od.A("Hello");

	}

}
