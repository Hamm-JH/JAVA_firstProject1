package Chapter9.Cp91_NestedClass;

public class p411_Main {
    public static void main(String[] args) {
        p410_A a = new p410_A();

        p410_A.B b = a.new B();
        b.field1 = 3;
        b.method1();

        p410_A.C c = new p410_A.C();
        c.field1 = 3;
        c.method1();
        p410_A.C.field2 = 3;
        p410_A.C.method2();

        a.method();
    }
}
