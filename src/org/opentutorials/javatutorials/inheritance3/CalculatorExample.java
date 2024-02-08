package org.opentutorials.javatutorials.inheritance3;

class Calculator {
	int left, right;
	
	//public Calculator() {} 이렇게 선언해도 에러 안남
	
	// 생성자 선언해줌. 없으면 자바가 기본으로 알아서 만들어줌
	// 이렇게하면 부모생성자에 Calculator라는 생성자가 없다는 에러가 뜸
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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

class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		//this.left = left;
		//this.right = right;
		super(left, right); // super는 부모클래스를 의미함
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorExample {
	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		//c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
	}
}

overriding
부모가 갖고있는 메소드를 사용하나 재정의(변경)해서 사용
