// package org.opentutorials.javatutorials.overriding;

// class Calculator {
// 	int left, right;
// 	int third = 0;
	
// 	public void setOprands(int left, int right) {
// 		System.out.println("setOprands(int left, int right)");
// 		this.left = left;
// 		this.right = right;
// 	}
	
// 	// 두개 메소드의 이름이 동일하나 오버로딩해서 파라미터가 다르기때문에 에러가 안남
// 	public void setOprands(int left, int right, int third) {
// 		this.setOprands(left, right); // 중복코드 제거
// 		System.out.println("setOprands(int left, int right, int third)");
// 		this.third = third;
// 	}
	
// 	public void sum() {
// 		System.out.println(this.left + this.right + this.third);
// 	}
	
// 	public void avg() {
// 		System.out.println((this.left + this.right + this.third) / 2);
// 	}
// }

// public class CalculatorDemo2 {
// 	public static void main(String[] args) {
		
// 		Calculator c1 = new Calculator();
// 		c1.setOprands(10, 20);
// 		c1.sum();
// 		c1.avg();
// 		c1.setOprands(10, 20, 30);
// 		c1.sum();
// 		c1.avg();
		
// 	}
// }


