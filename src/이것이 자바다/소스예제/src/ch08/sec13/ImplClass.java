package ch08.sec13;

public class ImplClass implements InterfaceC {
    public void methodA() {
        System.out.println("메소드A실행");
    }
    public void methodB() {
        System.out.println("메소드B실행");
    }

    @Override
    public void methodC() {
        System.out.println("메소드C실행");
    }
}
