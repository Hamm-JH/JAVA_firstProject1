package Chapter12.Cp122_Manage_Thread;

public class p550_DaemonExample {
    public static void main(String[] args) {
        p550_AutoSaveThread autoSaveThread = new p550_AutoSaveThread();
        autoSaveThread.setDaemon(true); // AutoSaveThread를 데몬 스레드로 만듦
        autoSaveThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("메인 스레드 종료");
    }
}
