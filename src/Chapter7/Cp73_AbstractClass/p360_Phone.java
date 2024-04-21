package Chapter7.Cp73_AbstractClass;

public abstract class p360_Phone {
    public String owner;

    public p360_Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
