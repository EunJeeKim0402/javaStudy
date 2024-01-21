package org.opentutorials.javatutorials.array;

public class ArrayLoopDemo {

	public static void main(String[] args) {
		
		String[] members = { "홍길동", "홍길이", "홍길삼", "홍길사" };
		
		for(int i=0; i<members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}

	}

}
