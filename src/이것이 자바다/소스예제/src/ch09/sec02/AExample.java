package ch09.sec02;

public class AExample {
    public static void main(String[] args) {
        A a = new A(); // A객체 생성

        A.B b = a.new B(); // B객체 생성. A. 이런식으로 안하면 에러남
    }
}
