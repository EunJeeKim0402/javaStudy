// package org.opentutorials.javatutorials.constant2;

// class Fruit {
//     // interface에서 명시하는 변수는 public final static이 생략된것 ex. int APPLE = 1
//     //int APPLE = 1, PEACH = 2, BANANA = 3;
//     public static final Fruit APPLE = new Fruit();
//     public static final Fruit PEACH = new Fruit();
//     public static final Fruit BANANA = new Fruit();
// }
// class Company {
//     public static final Company GOOGLE = new Company();
//     public static final Company APPLE = new Company();
//     public static final Company ORACLE = new Company();
// }

// public class ConstantDemo {
// 	public static void main(String[] args) {
//         //if(Fruit.APPLE == Company.APPLE) {
//             //System.out.println("과일애플과 기업애플은 같습니다.");
//         //} 컴파일러가 타입에러를 사전에 잡아줌

//         int type = Fruit.APPLE;
//         switch(type) { // 스위치문에서는 제한된 타입만 사용할 수 있음... 제작 클래스 안됨ㅠ
//             // enum을 통해서 그런 아쉬움을 해결할 수 있다고 함!
//             case Fruit.APPLE:
//                 System.out.println(57 + "kcal");
//             case Fruit.PEACH:
//                 System.out.println(34 + "kcal");
//             case Fruit.BANANA:
//                 System.out.println(93 + "kcal");
//                 break;
//         }
//     }
// }


