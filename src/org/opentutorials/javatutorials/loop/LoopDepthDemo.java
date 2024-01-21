package org.opentutorials.javatutorials.loop;

public class LoopDepthDemo {

	public static void main(String[] args) {
		
		// 반복문 중첩
		for(int i=0; i<10; i++) { // 00~99
			for(int j=0; j<10; j++) {
				System.out.println(i + "" + j);
			}
		}

	}

}
