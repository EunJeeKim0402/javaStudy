package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		
		// 조건문 중첩
		String id = args[0];
		String password = args[1];
		
		if(id.equals("egoing")) {
			if(password.equals("111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			
		} else {
			System.out.println("틀린id");
		}
		
	}

}



