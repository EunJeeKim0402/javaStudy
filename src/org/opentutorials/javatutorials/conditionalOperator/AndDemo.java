package org.opentutorials.javatutorials.conditionalOperator;

public class AndDemo {

	public static void main(String[] args) {

		// 논리연산자(&& / ||)
		if(true && true) {
			System.out.println(1); // 1
		}
		
		if(true && false) {
			System.out.println(2); // 출력X
		}
		
		if(false && true) {
			System.out.println(3); // 출력X
		}
		
		if(false && false) {
			System.out.println(4); // 출력X
		}


	}

}
