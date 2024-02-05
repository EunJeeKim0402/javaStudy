package org.opentutorials.javatutorials.classninstance;

class C1 {
	
	// static이 붙어있으니 클래스변수
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근 불가
		//System.out.println(instance_variable);
	}
	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근 가능
		System.out.println(static_variable);
	}
	void instance_instance() {
		System.out.println(instance_variable);
	}
	
}

public class CalculatorDemo4 {
	
	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
	}

}


