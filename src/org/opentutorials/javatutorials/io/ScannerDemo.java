package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// Scanner는 자바가 제공하는 라이브러리
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i * 1000);
		sc.close();
		
	}

}
