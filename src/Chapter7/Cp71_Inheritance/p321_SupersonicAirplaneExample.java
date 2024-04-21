package Chapter7.Cp71_Inheritance;

public class p321_SupersonicAirplaneExample {
    public static void main(String[] args) {
        p320_SupersonicAirplane sa = new p320_SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = p320_SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = p320_SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
