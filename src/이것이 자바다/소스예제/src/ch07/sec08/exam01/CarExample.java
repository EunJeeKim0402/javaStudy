package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car(); // Car 객체 생성

        myCar.tire = new Tire(); // Tire 객체 장착
        myCar.run();

        myCar.tire = new HankookTire(); // Tire 객체 장착
        myCar.run();

        myCar.tire = new KumhoTire(); // Tire 객체 장착
        myCar.run();
    }
}
