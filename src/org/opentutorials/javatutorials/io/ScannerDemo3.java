package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
		
		// out.txt에 1000이 곱해짐
		try { // 예외처리
			File file = new File("out.txt");
			Scanner sc = new Scanner(file); // out.txt라는 파일의 입력값을 가져와라
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt() * 1000);
			}
			sc.close();
		} catch(FileNotFoundException e) { // File을 찾을 수 없는 경우
			e.printStackTrace();
		}
		
	}

}


