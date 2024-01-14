package org.opentutorials.javatutorials.numberstring;

public class CharString {
	public static void main(String[] args) {
		System.out.println('생'); // 문자 ''
		System.out.println("생활"); // 문자열 ""
		System.out.println("생"); // 한글자더라도 ""로 감싸면 문자열로 취급
		
		System.out.println("생활" + "코딩"); // 생활코딩
		System.out.println("1" + "1"); // 11
		
		System.out.println("안녕하세요 저는 \n\"귤껌\" 입니다."); // \n줄바꿈 \특수문자
	}
}
