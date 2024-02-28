package org.opentutorials.javatutorials.polymorphism;

class AA1 {
	public String x() {return "A1.x";}
}
class BB1 extends AA1 {
	public String x() {return "B1.x";}
	public String y() {return "y";}
}
class BB2 extends AA1 {
	public String x() {return "B2.x";}
}

public class PolymorphismOverloadingDemo3 {

	public static void main(String[] args) {
		AA1 obj = new BB1();
		AA1 obj2 = new BB2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}

}
