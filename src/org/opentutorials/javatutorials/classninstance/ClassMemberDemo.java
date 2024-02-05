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

public class ClassMemberDemo {
	
	public static void main(String[] args) {

		C1 c = new C1();
		c.static_static();
		c.static_instance();
		c.instance_static();
		c.instance_instance();
		C1.static_static();
		C1.static_instance();
		
	}

}


