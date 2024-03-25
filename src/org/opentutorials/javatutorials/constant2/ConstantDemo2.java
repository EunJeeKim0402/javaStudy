package org.opentutorials.javatutorials.constant2;

/*
class Fruit {
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
클래스를 상수로 정의하게되면 열거할 수 없다는 단점이 있음
*/
// 열거형의 특성
// 연관된 값들(상수형)저장
// 그것 자체가 클래스이기 때문에 클래스가 할 수 있는 일들을 할 수 있다
enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor() {
        return this.color;
    }
    Fruit(String color) {
        System.out.println("call 생성자" + this);
        this.color = color;
    }
}
enum Company {
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2 {
	public static void main(String[] args) {
        /* 
        Fruit type = Fruit.APPLE;
        switch(type) { 
            case APPLE:
                System.out.println(57 + "kcal, color " + Fruit.APPLE.getColor());
            case PEACH:
                System.out.println(34 + "kcal, color " + Fruit.PEACH.getColor());
            case BANANA:
                System.out.println(93 + "kcal, color " + Fruit.BANANA.getColor());
                break;
        }
        */
        for(Fruit f : Fruit.values()) {
            System.out.println(f);
        }
    }
}


