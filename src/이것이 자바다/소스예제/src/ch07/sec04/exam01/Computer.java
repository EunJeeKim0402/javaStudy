package ch07.sec04.exam01;

public class Computer extends Calculator {
    @Override // 메소드 오버라이딩
    public double areaCircle(double r) {
        System.out.println("컴퓨터 객체의 areaCircle");
        return Math.PI * r * r;
    }
}
