package org.opentutorials.javatutorials.exception;

class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		if(right == 0) {
			throw new IllegalArgumentException("두번째 인자는 0을 허용하지않음");
		}
		this.left = left;
		this.right = right;
	}
	public void divide() {
		if(right == 0) {
			throw new ArithmeticException("두번째 인자는 0을 허용하지않음");
		}
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left/this.right);
			System.out.println(" 입니다.");
		} catch(Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {;
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
