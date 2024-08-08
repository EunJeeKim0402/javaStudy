package ch08.sec06;

import ch08.sec06.RemoteControl;

public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio켬");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio끔");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > ch08.sec04.RemoteControl.MAX_VOLUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOLUME; // 인터페이스의 상수를 이용해서 max값 제한
        } else if(volume < ch08.sec04.RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME; // min값 제한
        } else {
            this.volume = volume;
        }

        System.out.println("현재 Audio볼륨 : " + this.volume);
    }

    // 추가 필드 선언
    private int memoryVolume;

    // 디폴트 메소드 재정의
    @Override
    public void setMute(boolean mute) {
        if(mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리함");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음해제");
            setVolume(this.memoryVolume);
        }
    }
}
