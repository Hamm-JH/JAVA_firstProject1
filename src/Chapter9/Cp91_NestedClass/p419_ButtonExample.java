package Chapter9.Cp91_NestedClass;

public class p419_ButtonExample {
    public static void main(String[] args) {
        p417_Button btn = new p417_Button();

        btn.setOnClickListener(new p418_CallListener());
        btn.touch();

        btn.setOnClickListener(new p418_MessageListener());
        btn.touch();
    }
}
