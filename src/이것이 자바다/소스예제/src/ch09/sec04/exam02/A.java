package ch09.sec04.exam02;

import org.w3c.dom.ls.LSOutput;

public class A {
    // 메소드
    void useB() {
        // 로컬클래스
        class B {
            // 인스턴스 필드
            int field1 = 1;

            // 정적 필드(자바17부터)
            static int field2 = 2;

            // 생성자
            B() {
                System.out.println("B 생성자 실행");
            }

            // 인스턴스 메소드
            void method1() {
                System.out.println("B method1 실행");
            }

            // 정적메소드(자바17부터)
            static void method2() {
                System.out.println("B method2 실행");
            }
        }

        // 로컬객체 생성
        B b = new B();

        // 로컬객체의 인스턴스필드와 메소드 사용
        System.out.println(b.field1);
        b.method1();

        // 로컬객체의 정적필드와 메소드 사용(자바17부터)
        System.out.println(B.field2);
        B.method2();
    }
}
