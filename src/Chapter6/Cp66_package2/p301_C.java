package Chapter6.Cp66_package2;

import Chapter6.Cp66_package.*;

public class p301_C {
    public p301_C() {
        p300_A a = new p300_A();
        a.field1 = 1;
//        a.field2 = 1; // default
//        a.field3 = 1; // private

        a.method1();
//        a.method2(); // default
//        a.method3(); // private
    }
}
