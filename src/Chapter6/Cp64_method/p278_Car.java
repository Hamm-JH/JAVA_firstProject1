package Chapter6.Cp64_method;

public class p278_Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        p278_Car myCar = new p278_Car();
        myCar.speed = 60;
        myCar.run();
    }
}
