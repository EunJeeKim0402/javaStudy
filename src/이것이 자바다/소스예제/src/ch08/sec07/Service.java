package ch08.sec07;

public interface Service {
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("디폴트메소드1 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2() {
        System.out.println("디폴트메소드2 종속 코드");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("디폴트메소드 중복 코드A");
        System.out.println("디폴트메소드 중복 코드B");
    }

    // 정적 메소드
    static void staticMethod1() {
        System.out.println("스태틱메소드1 종속 코드");
        staticCommon();
    }
    static void staticMethod2() {
        System.out.println("스태틱메소드2 종속 코드");
        staticCommon();
    }

    // private 정적 메소드
    private static void staticCommon() {
        System.out.println("스태틱메소드 중복 코드A");
        System.out.println("스태틱메소드 중복 코드B");
    }
}
