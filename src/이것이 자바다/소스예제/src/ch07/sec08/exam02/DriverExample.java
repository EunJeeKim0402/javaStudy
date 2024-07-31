package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus); // 매개값으로 Bus객체 제공하고 driver메소드 호출

        Taxi taxi = new Taxi();
        driver.drive(taxi); // 매개값으로 taxi객체 제공하고 driver메소드 호출
    }
}
