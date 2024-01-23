package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	
	/*
	 메소드
	method와 function(함수)는 같은 뜻. 자바에서는 메소드, 다른 언어에서는 함수라고 함.
	public static void main(String[] args) { // main이 메소드
		numbering();
	}
	*/
	
	public static void numbering() { // 넘버링 메소드 정의
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) { // 넘버링 메소드 호출
		numbering();
	}

}

