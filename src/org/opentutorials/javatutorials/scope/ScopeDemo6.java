package org.opentutorials.javatutorials.scope;

class C {
	int v = 10;
	
	void m() {
		int v = 20; // 지역변수가 더 우선순위가 높아서 이게 실행됨
		System.out.println(v); //20
		System.out.println(this.v); // 10. 인스턴스 자신을 의미하는것이 this
	}
}

public class ScopeDemo6 {
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.m();
		
	}
}
