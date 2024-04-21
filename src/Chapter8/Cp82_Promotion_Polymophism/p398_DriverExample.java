package Chapter8.Cp82_Promotion_Polymophism;

public class p398_DriverExample {
    public static void main(String[] args) {
        p393_Driver driver = new p393_Driver();

        p393_Bus bus = new p393_Bus();
        p393_Taxi taxi = new p393_Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
