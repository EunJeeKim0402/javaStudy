package ch09.sec07.exam03;

import ch09.sec06.exam03.Button;

public class ButtonExample {
    public static void main(String[] args) {
        // ok버튼객체 생성
        Button btnOk = new Button();

        // ok버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Ok버튼클릭");
            }
        });

        // ok버튼 클릭
        btnOk.click();

        //-----------------------------------------------------------

        // cancel버튼 객체 생성
        Button btnCancel = new Button();

        // cancel버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("cancel버튼 클릭");
            }
        });

        // cancel버튼 클릭
        btnCancel.click();
    }
}
