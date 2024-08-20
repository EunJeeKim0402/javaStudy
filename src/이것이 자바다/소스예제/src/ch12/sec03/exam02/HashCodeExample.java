package ch12.sec03.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student s1 = new Student(1, "홍길동");
        Student s2 = new Student(1, "홍길동");

        if(s1.hashCode() == s2.hashCode()) { // 해시코드가 동일한지 검사
            if(s1.equals(s2)) {
                System.out.println("동등 객체");
            } else {
                System.out.println("데이터가 달라서 동등객체가 아님");
            }
        } else {
            System.out.println("해시코드가 달라서 동등객체가 아님");
        }
    }
}
