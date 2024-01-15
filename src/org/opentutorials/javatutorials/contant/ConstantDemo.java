package org.opentutorials.javatutorials.contant;

public class ConstantDemo {

	public static void main(String[] args) {
		/*
		 * 상수
		 * 상수란 변하지 않는 값
		 * 변수와 상수는 모두 데이터타입이 있다.
		 */
		
		// float a = 2.2; 둘다 실수인데 타입 미스매치 에러가 뜸
		double a = 2.2; // 그런데 double은 에러가 뜨지 않음
		// 즉 2.2의 데이터타입은 double이라는것
		
		float b = 2.2F; // 이렇게하면 에러가 사라짐. F로 플롯타입이라는걸 명시해주는것
		// 변수와 상수 모두 데이터타입이 있음
		// 기본적으로 실수는 double타입이고, 굳이 플롯타입을 사용하고싶으면 F를 붙이기
		
		// int c = 2147483648; int가 표현할 수 있는 수보다 1 높아서 에러가 뜸
		// long c = 2147483648; // 에러가 사라질줄알았는데 아직도 에러.
		// 상수형의 기본 데이터타입이 int이기 때문에 에러가 나는것임. L을 붙임으로써 사용가능
		long c = 2147483648L;
	}

}


