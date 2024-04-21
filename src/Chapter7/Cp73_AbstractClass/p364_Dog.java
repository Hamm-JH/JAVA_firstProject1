package Chapter7.Cp73_AbstractClass;

public class p364_Dog extends p363_Animal{
    public p364_Dog() {
        this.kind = "포유류";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
