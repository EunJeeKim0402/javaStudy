package ch07.sec10.exam01;

public class SmartPhone extends Phone {
    SmartPhone(String owner) { // 생성자 선언
        super(owner); // Phone 생성자 호출
    }

    void internetSearch() {
        System.out.println("인터넷서핑중");
    }
}
