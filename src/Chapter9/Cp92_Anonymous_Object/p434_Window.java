package Chapter9.Cp92_Anonymous_Object;

public class p434_Window {
    p433_Button button1 = new p433_Button();
    p433_Button button2 = new p433_Button();

    // 필드 초기값으로 대입
    p433_Button.OnClickListener listener = new p433_Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };

    p434_Window() {
        button1.setOnClickListener(listener);
        button2.setOnClickListener(new p433_Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다.");
            }
        });
    }
}
