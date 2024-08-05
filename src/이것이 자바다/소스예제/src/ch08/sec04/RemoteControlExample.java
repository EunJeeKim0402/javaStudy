package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc; // 인터페이스 변수 선언

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5); // 인터페이스로 television객체 사용
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5); // 인터페이스로 audio객체 사용
        rc.turnOff();
    }
}
