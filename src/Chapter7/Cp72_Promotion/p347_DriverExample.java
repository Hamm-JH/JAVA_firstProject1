package Chapter7.Cp72_Promotion;

public class p347_DriverExample {
    public static void main(String[] args) {
        p346_Driver driver = new p346_Driver();

        p347_Bus bus = new p347_Bus();
        p347_Taxi taxi = new p347_Taxi();

        driver.drive(bus);
        driver.drive(taxi);
    }
}
