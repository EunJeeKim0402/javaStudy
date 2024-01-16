package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {

		// boolean
		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("one" == "one"); // true
		
		System.out.println(1 != 2); // true
		System.out.println(1 != 1); // false
		System.out.println("one" != "two"); // true
		System.out.println("one" != "one"); // false
		
		// < , <=크거나 같다
		System.out.println(10 > 20); // false
		System.out.println(10 >= 2); // true
		
		// 문자열 비교는 .equals
		String str = "Hello";
		String str2 = new String("Hello");
		System.out.println(str == str2); // false
		System.out.println(str.equals(str2)); // true

	}

}

