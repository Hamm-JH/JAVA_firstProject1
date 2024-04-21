package Chapter8.Cp82_Promotion_Polymophism;

public class p396_VehicleExample {
    public static void main(String[] args) {
        p395_Vehicle vehicle = new p395_Bus();

        vehicle.run();
//        vehicle.checkFare(); // Vehicle 인터페이스에는 checkFare()가 없음

        p395_Bus bus = (p395_Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
