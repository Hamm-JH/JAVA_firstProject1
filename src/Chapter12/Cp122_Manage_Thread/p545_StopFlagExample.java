package Chapter12.Cp122_Manage_Thread;

public class p545_StopFlagExample {
    public static void main(String[] args) {
        p546_PrintThread1 printThread = new p546_PrintThread1();
        printThread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        printThread.setStop(true);
    }
}
