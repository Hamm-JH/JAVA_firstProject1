package Chapter12.Cp121_MultiThread;

import java.awt.Toolkit;

public class p526_BeepTask implements Runnable{
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
