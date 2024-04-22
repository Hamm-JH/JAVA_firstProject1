package Chapter12.Cp121_MultiThread;

public class p531_ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());

        p532_ThreadA threadA = new p532_ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName());
        threadA.start();

        p532_ThreadB threadB = new p532_ThreadB();
        System.out.println("작업 스레드 이름: " + threadB.getName());
        threadB.start();
    }
}
