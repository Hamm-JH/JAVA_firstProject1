package Chapter12.Cp121_MultiThread;

public class p534_MainThreadExample {
    public static void main(String[] args) {
        p534_Calculator calculator = new p534_Calculator();

        p535_User1 user1 = new p535_User1();
        user1.setCalculator(calculator);
        user1.start();

        p535_User2 user2 = new p535_User2();
        user2.setCalculator(calculator);
        user2.start();
    }
}
