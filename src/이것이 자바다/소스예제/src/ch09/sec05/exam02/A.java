package ch09.sec05.exam02;

public class A {
    // A의 인스턴스필드
    String field = "A필드";

    // A 인스턴스 메소드
    void method() {
        System.out.println("A메소드");
    }

    // 인스턴스 멤버 클래스
    class B {
        // B 인스턴스 필드
        String field = "B필드";

        // B 인스턴스 메소드
        void method() {
            System.out.println("B메소드");
        }

        // B 인스턴스 메소드
        void print() {
            // B 객체의 필드/메소드 사용
            System.out.println(this.field);
            this.method();

            // A 객체의 필드/메소드 사용
            System.out.println(A.this.field);
            A.this.method();
        }
    }

    // A 인스턴스 메소드
    void useB() {
        B b = new B();
        b.print();
    }
}
