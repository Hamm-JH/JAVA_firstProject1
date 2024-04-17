package Chapter6.Cp66_package;

public class p300_A {
    public int field1; // public 접근 제한
    int field2; // default 접근 제한
    private int field3; // private 접근 제한
    
    public p300_A() {
        field1 = 1; // o
        field2 = 1; // o
        field3 = 1; // o
        
        method1();  // o
        method2();  // o
        method3();  // o
    }
    
    public void method1() {} // public 접근제한
    void method2() {}   // default 접근 제한
    private void method3() {}   // private 접근 제한
}
