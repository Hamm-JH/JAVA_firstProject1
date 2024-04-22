package Chapter12.Cp121_MultiThread;

public class p532_ThreadA extends Thread{
    public p532_ThreadA() {
        setName("ThreadA");
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
