package ch09.sec04.exam03;

public class A {
    // 메소드
    public void method1(int arg) {
        // 로컬변수
        int var = 1;

        // 로컬클래스
        class B {
            void method2() {
                // 로컬 변수 읽기
                System.out.println("arg : " + arg);
                System.out.println("var : " + var);

                // 로컬 변수 수정
                //arg = 2; 불가
                //var = 2; 불가
            }
        }

        // 로컬 객체 생성
        B b = new B();

        // 로컬 객체 메소드 호출
        b.method2();

        // 여기서도 로컬변수수정 안됨
    }
}
