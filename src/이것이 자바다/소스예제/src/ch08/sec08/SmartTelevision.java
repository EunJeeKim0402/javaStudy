package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {
    @Override
    public void turnOn() {
        System.out.println("티비 켬");
    }
    @Override
    public void turnOff() {
        System.out.println("티비 끔");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색");
    }
}
