package Chapter12.Cp121_MultiThread;

public class p535_User2 extends Thread{
    private p534_Calculator calculator;

    public void setCalculator(p534_Calculator calculator) {
        this.setName("User2");
        this.calculator = calculator;
    }

    public void run() {
        calculator.setMemory(50);
    }
}
