package org.opentutorials.javatutorials.loop;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5) // i가 5가되면 중지 
				break;			
				// continue; 이건 반대로 계속하는것
			System.out.println(i + "번째 출력중");
		}

	}

}
