package ch09.sec02;

public class A1 {
    // 인스턴스 멤버 클래스
    class B1 {
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드(자바17부터)
        static int field2 = 2;

        // 생성자
        B1() {
            System.out.println("B1생성자 실행");
        }

        // 인스턴스 메소드
        void method1() {
            System.out.println("B1-method1 실행");
        }

        // 정적메소드(자바17부터)
        static void method2() {
            System.out.println("B1-method2 실행");
        }
    }

    // 인스턴스 메소드
    void useB1() {
        // B1객체 생성 및 인스턴스 필드 및 메소드 사용
        B1 b = new B1();
        System.out.println(b.field1);
        b.method1();

        // B1클래스의 정적 필드 및 메소드 사용
        System.out.println(B1.field2);
        B1.method2();
    }
}
