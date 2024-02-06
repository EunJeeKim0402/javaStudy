package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
	
	// 이렇게되면 무한 0이 출력됨.
	static int i; // static 전역변수 

	static void a() {
		i = 0; // 만약 int i라고하면 a의 스코프 안에서만 동작하는 변수라는것임
	}

	public static void main(String[] args) {

		for(i=0; i<5; i++) {
			a();
			System.out.println(i);
		}

	}

}
