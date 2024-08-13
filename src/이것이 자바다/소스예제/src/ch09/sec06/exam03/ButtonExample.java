package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // ok버튼객체 생성
        Button btnOk = new Button();

        // ok버튼 클릭이벤트 처리할 ClickListener 구현 클래스(로컬클래스)
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("ok버튼 클릭");
            }
        }

        // ok버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());

        // ok버튼 클릭
        btnOk.click();

        //-----------------------------------------------------------

        // cancel버튼 객체 생성
        Button btnCancel = new Button();

        // cancel버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬클래스)
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("cancel버튼 클릭");
            }
        }

        // cancel버튼 객체에 ClickListener 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        // cancel버튼 클릭
        btnCancel.click();
    }
}
