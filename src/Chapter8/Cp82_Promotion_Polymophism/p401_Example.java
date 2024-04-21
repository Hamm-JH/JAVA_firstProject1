package Chapter8.Cp82_Promotion_Polymophism;

public class p401_Example {
    public static void main(String[] args) {
        p400_InterfaceC impl = new p400_ImplementationC();

        p400_InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        p400_InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        p400_InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
