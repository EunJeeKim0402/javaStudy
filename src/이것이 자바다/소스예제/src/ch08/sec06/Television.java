package ch08.sec06;

import ch08.sec06.RemoteControl;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV켬");
    }

    @Override
    public void turnOff() {
        System.out.println("TV끔");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME; // 인터페이스의 상수를 이용해서 max값 제한
        } else if(volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME; // min값 제한
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV볼륨 : " + this.volume);
    }
}
