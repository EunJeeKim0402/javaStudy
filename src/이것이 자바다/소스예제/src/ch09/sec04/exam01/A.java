package ch09.sec04.exam01;

public class A {
    // 생성자
    A() {
        class B {} // 로컬클래스 선언

        B b = new B(); // 로컬객체생성
    }

    void method() {
        class B {} // 로컬클래스 선언

        B b = new B(); // 로컬객체생성
    }
}
