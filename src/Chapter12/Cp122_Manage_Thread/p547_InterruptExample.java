package Chapter12.Cp122_Manage_Thread;

public class p547_InterruptExample {
    public static void main(String[] args) {
        Thread thread = new p547_PrintThread2();
        thread.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
