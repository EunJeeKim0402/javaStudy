package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MethodDemo7 {
	
	public static String numbering(int init, int limit) { 
		int i = init;
		String output = "";
		
		while (i < limit) {
			output += i;
			i++;
		}
		
		return output; 
	}

	public static void main(String[] args) {
		String result = numbering(1, 5);
		System.out.println(result);
		
		// result값을 화면에 출력 및 기록하려는 예제. out.txt에 result값을 파일에 기록하려는것
		// root 디렉토리에 생겼을것임
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch(IOException e) {
			
		}
	}
}


