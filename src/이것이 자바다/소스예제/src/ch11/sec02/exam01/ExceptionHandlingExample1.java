package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // data가 null일 경우 NullPointException 발생
            System.out.println("문자 수 : " + result);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage()); // 예외정보얻는방법 1
            // System.out.println(e.toString()); // 예외정보얻는방법 2
            // e.printStackTrace(); // 예외정보얻는방법 3
        } finally {
            System.out.println("마무리 실행\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
