package Chapter9.Cp92_Anonymous_Object;

public class p433_Button {

    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }

    static interface OnClickListener {
        void onClick();
    }
}
