package org.opentutorials.javatutorials.array;

public class GetDemo {

	public static void main(String[] args) {
		
		//String[] classGroup = { "홍길동", "홍길이", "홍길삼", "홍길사" };
		//System.out.println(classGroup[0]);
		//System.out.println(classGroup[1]);
		//System.out.println(classGroup[2]);
		//System.out.println(classGroup[3]);
		
		// 위 코드와 똑같은데 선언 방식이 다름
		String[] classGroup = new String[4]; // 4짜리 배열 선언
		classGroup[0] = "홍길동";
		System.out.println(classGroup.length);
		classGroup[0] = "홍길이";
		classGroup[0] = "홍길삼";
		classGroup[0] = "홍길사";

	}

}
