package Chapter6.Cp66_package;

public class p300_B {
    public p300_B() {
        p300_A a = new p300_A();
        a.field1 = 1; // o
        a.field2 = 1; // o
        //a.field3 = 1; // x, private

        a.method1();
        a.method2();
        //a.method3(); // private
    }

}
