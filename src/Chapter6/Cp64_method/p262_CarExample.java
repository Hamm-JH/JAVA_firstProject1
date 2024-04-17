package Chapter6.Cp64_method;

public class p262_CarExample {
    public static void main(String[] args) {
        p262_Car myCar = new p262_Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
