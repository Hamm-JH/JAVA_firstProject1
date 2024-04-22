package Chapter12.Cp121_MultiThread;

public class p526_BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new p526_BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); }
            catch (Exception e) {}
        }
    }
}
