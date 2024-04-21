package Chapter8.Cp82_Promotion_Polymophism;

public class p390_CarExample {
    public static void main(String[] args) {
        p390_Car myCar = new p390_Car();

        myCar.run();

        myCar.frontLeftTire = new p389_KumhoTire();
        myCar.frontRightTire = new p389_KumhoTire();

        myCar.run();
    }
}
