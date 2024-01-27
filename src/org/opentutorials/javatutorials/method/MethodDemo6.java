package org.opentutorials.javatutorials.method;

public class MethodDemo6 {
	
	public static String numbering(int init, int limit) { 
		int i = init;
		String output = ""; // 숫자를 output에 담기위함
		
		while (i < limit) {
			output += i;
			i++;
		}
		
		return output; // output 문자열을 메소드 외부로 반환하려면 이런식으로 return해야됨
	}

	public static void main(String[] args) {
		String result = numbering(1, 5);
		
		System.out.println(result);
	}

}

