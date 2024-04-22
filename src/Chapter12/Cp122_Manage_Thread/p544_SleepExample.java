package Chapter12.Cp122_Manage_Thread;

import java.awt.Toolkit;

public class p544_SleepExample {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) { }
        }
    }
}
