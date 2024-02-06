package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	
	// 유효범위(스코프) 안에서 선언하면 그 변수는 해당 메소드 안에서만 사용 가능
	static void a() {
		int i = 0;
	}

	public static void main(String[] args) {

		for(int i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

	}

}
