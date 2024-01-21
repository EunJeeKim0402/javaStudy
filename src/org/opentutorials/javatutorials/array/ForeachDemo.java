package org.opentutorials.javatutorials.array;

public class ForeachDemo {

	public static void main(String[] args) {
		
		String[] members = { "홍길동", "홍길이", "홍길삼", "홍길사" };
		
		for(String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}

	}

}

