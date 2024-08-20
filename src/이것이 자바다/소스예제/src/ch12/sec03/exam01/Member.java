package ch12.sec03.exam01;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) { // Object의 equals메소드 재정의
        if(obj instanceof Member target) { // obj가 Member타입인지 검사하고 타입변환 후 targer변수에 대입
            if(id.equals(target.id)) {
                return true;
            }
        }
        return false;
    }
}
