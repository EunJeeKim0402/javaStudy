package org.opentutorials.javatutorials.progenitor;

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void sum() {
		System.out.println(this.left + this.right);		
	}
	public void avg() {
		System.out.println((this.left + this.right) / 2);		
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {;
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		System.out.println(c1); // 암시적으로 toString메소드 호출
	}

}
