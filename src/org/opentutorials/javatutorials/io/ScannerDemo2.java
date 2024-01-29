package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		// 이 프로그램은 1과는 다르게 엔터치면 계속 반복적으로 입력-출력이 가능
		// while문 들어간것이 차이
		// hasNextInt() : Scanner입력값이 int일때만 true반환
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
		}
		
		sc.close();
		
	}

}
