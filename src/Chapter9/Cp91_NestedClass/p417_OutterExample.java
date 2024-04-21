package Chapter9.Cp91_NestedClass;

public class p417_OutterExample {
    public static void main(String[] args) {
        p416_Outter outter = new p416_Outter();
        p416_Outter.Nested nested = outter.new Nested();
        nested.print();
    }
}
