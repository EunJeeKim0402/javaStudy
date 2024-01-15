package org.opentutorials.javatutorials.operator;

public class PrePostDemo {

	public static void main(String[] args) {

		// 단항연산자
		int i = 3;
		i++;
		System.out.println(i); // 4
		++i;
		System.out.println(i); // 5
		System.out.println(++i); // 6
		System.out.println(i++); // 6. 문단이 끝나는 그 시점에서 1이 더해짐
		System.out.println(i); // 7

	}

}
