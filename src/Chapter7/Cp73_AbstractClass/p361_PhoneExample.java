package Chapter7.Cp73_AbstractClass;

public class p361_PhoneExample {
    public static void main(String[] args) {
//        p360_Phone phone = new p360_Phone();
        p361_SmartPhone smartPhone = new p361_SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
