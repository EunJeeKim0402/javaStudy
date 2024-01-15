package org.opentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 3
		System.out.println(c/d); // 3.333...
		System.out.println(a/d); // 3.333... 정수를 실수로 나눌때
		// 더 넓은 표현식인 실수로 형변환을 해주고 거기에서 다시 나눠줌.

	}

}
