package org.opentutorials.javatutorials.inheritance;

// 상속한걸 또 상속 가능
class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorExample3 {
	public static void main(String[] args) {
		
		DivisionableCalculator c1 = new DivisionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.multiplication();
		c1.division();
		
	}
}
