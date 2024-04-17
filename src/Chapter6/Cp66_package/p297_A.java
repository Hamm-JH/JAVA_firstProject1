package Chapter6.Cp66_package;

public class p297_A {
    p297_A a1 = new p297_A(true);
    p297_A a2 = new p297_A(1);
    p297_A a3 = new p297_A("문자열");

    public p297_A(boolean b) {} // public 접근 제한
    p297_A(int b) {} // default 접근 제한
    private p297_A(String s) {} // private 접근 제한
}
