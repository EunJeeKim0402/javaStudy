// package org.opentutorials.javatutorials.exception;

// class DivideException extends Exception {
// 	public int left;
// 	public int right;
// 	DivideException() {
// 		super();
// 	}
// 	DivideException(String message) {
// 		super(message);
// 	}
// 	DivideException(String message, int left, int right) {
// 		super(message);
// 		this.left = left;
// 		this.right = right;
// 	}
// }
// class Calculator {
// 	int left, right;
// 	public void setOprands(int left, int right) {
// 		if(right == 0) {
// 			throw new IllegalArgumentException("두번째 인자는 0을 허용하지않음");
// 		}
// 		this.left = left;
// 		this.right = right;
// 	}
// 	public void divide() {
// 		try {
// 			if(right == 0) {
// 				throw new DivideException("두번째 인자는 0을 허용하지않음", this.left, this.right);
// 			}
// 			System.out.println(this.left/this.right);
// 		} catch(DivideException e) {
// 			e.printStackTrace();
// 		}
		
// 	}
// }

// public class CalculatorDemo {

// 	public static void main(String[] args) {;
// 		Calculator c1 = new Calculator();
// 		c1.setOprands(10, 0);
// 		try {
// 			c1.divide();
// 		} catch(ArithmeticException e) {
// 			System.out.println(e.getMessage());
// 			System.out.println(e.left());
// 			System.out.println(e.right());
// 		}
// 	}

// }
