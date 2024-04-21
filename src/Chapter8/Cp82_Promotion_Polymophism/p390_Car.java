package Chapter8.Cp82_Promotion_Polymophism;

public class p390_Car {
    p389_Tire frontLeftTire = new p389_HankookTire();
    p389_Tire frontRightTire = new p389_HankookTire();
    p389_Tire backLeftTire = new p389_HankookTire();
    p389_Tire backRightTire = new p389_HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
