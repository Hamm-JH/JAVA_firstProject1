package Chapter8.Cp82_Promotion_Polymophism;

public class p397_Driver {
    public void drive(p395_Vehicle vehicle) {
        if(vehicle instanceof  p395_Bus) {
            p395_Bus bus = (p395_Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
