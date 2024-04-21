package Chapter9.Cp91_NestedClass;

public class p417_Button {
    // 인터페이스 타입 필드
    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); // 구현 객체의 onclick() 메소드 호출
    }

    static interface OnClickListener {
        void onClick(); // 중첩 인터페이스
    }
}
