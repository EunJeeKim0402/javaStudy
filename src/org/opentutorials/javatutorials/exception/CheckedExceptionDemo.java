// package org.opentutorials.javatutorials.exception;

// import java.io.*;

// public class CheckedExceptionDemo {

// 	public static void main(String[] args) {
	
// 		// 이대로 실행하면 에러가남.
// 		//Unhandled exception type FileNotFoundException
// 		//Unhandled exception type IOException
// 		// 마우스 가져다대면 가장 빠른 에러처리방법을 알려줌
// 		BufferedReader bReader;
// 		try {
// 			bReader = new BufferedReader(new FileReader("out.txt"));
// 		} catch (FileNotFoundException e) {
// 			// TODO Auto-generated catch block
// 			e.printStackTrace();
// 		}
// 		String input = bReader.readLine();
// 		System.out.println(input);

// 	}

// }
