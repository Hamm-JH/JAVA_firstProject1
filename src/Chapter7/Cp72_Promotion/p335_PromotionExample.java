package Chapter7.Cp72_Promotion;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class p335_PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // 상속 관계에 있지 않아 에러
//        B b3 = e;
//        C c2 = d;
    }
}
