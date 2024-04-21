package Chapter7.Cp73_AbstractClass;

public class p364_Cat extends p363_Animal{
    public p364_Cat() {
        this.kind = "포유류";
    }


    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
