package ch07.sec10.exam01;

public abstract class Phone {
    String owner; // 필드 선언

    Phone(String owner) { // 생성자 선언
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("폰 전원 켬");
    }
    void turnOff() {
        System.out.println("폰 전원 끔");
    }
}
