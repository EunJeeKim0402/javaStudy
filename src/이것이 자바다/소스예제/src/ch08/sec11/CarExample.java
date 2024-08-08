package ch08.sec11;

public class CarExample {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car myCar = new Car();

        myCar.run();

        // 타이어 객체 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        // run() 실행(다형성: 실제 결과가 다름)
        myCar.run();
    }
}
