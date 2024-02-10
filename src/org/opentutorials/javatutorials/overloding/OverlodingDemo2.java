package org.opentutorials.javatutorials.overloding;

public class OverlodingDemo2 extends OverlodingDemo {
	
	void A (String arg1, String arg2) {
		System.out.println("sub class : void A(String arg1, String arg2)");
	}
	void A () {
		System.out.println("sub class : void A()");
	}

	public static void main(String[] args) {

		OverlodingDemo2 od = new OverlodingDemo2();
		od.A();
		od.A(1);
		od.A("Hello");
		od.A("Hello", "Hi");

	}

}

클래스패스
클래스 경로를 내가 지정해서 자바가 필요로하는 클래스를 로드할 수 있게 해줌