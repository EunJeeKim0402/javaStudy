package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		
		System.out.println("switch(1)");
		
		switch(11) { // 그냥 출력하면 하나~셋까지 다출력됨. break 필요
		case 1 :
			System.out.println("하나");
			break;
		case 2 :
			System.out.println("둘");
			break;
		case 3 :
			System.out.println("셋");
			break;
		default :
			System.out.println("디폴트");
		}

	}

}

