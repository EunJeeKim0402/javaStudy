package org.opentutorials.javatutorials.method;

public class MethodDemo4 {
	
	public static void numbering(int init, int limit) { // limit을 변수, 혹은 파라미터라고함
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		numbering(3, 5); // limit에 입력값을 주고있는것. 여기서는 5가 인자(argument)
	}

}

