package org.opentutorials.javatutorials.operator;

public class ArithmeticDemo {

	public static void main(String[] args) {
		/*
		 * 형변환
		 * 데이터의 타입을 바꾼다는 것.
		 * 예를 들어 int등을 double이나 float등으로 바꾸고싶을 때
		 */
		/*
		double a = 3.0F; // 자동으로 형변환해주어 에러가 나지 않음.
		float b = 3.0; // 자동형변환이 안됨. 표현범위가 좁은 -> 넓은 타입 변환만 허용
		// 즉 형변환 가능순서 byte -> short/char -> int -> long -> float -> double
		// 정수 -> 실수 형변환만 가능

		// 명시적 형변환
		float c = 100.0; // 형변환 에러
		int d = 100.0F; // 형변환 에러
		float c1 = (float)100.0; // 에러가 안남
		int d1 = (int)100.0F; // 에러 안남
		*/
		
		int result = 1 + 2;
		System.out.println(result); // 3
		
		result = result - 1;
		System.out.println(result); // 2
		
		result = result * 2;
		System.out.println(result); // 4
		
		result = result / 2;
		System.out.println(result); // 2
		
		result = result + 8;
		System.out.println(result); // 10
		
		result = result % 7;
		System.out.println(result); // 나머지 3

	}

}
