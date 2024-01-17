package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		
		// 터미널에서 egoing을 입력하면 right이 나오는 프로그램
		// run 버튼 우측 삼각형 - 런 컨피겨레이션 - 새창 - argument에 입력
		String id = args[0]; // 입력값이 들어옴
		if(id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
	}

}


