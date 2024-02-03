package org.opentutorials.javatutorials.object;

public class CalculatorDemo2 {
	
	// 이전 클래스와 동일하나, 중복을 제거하는 메소드를 만듬.
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}

	public static void main(String[] args) {

		sum(10, 20);
		sum(20, 50);

	}

}


