package Chapter8.Cp82_Promotion_Polymophism;

public class p400_ImplementationC implements p400_InterfaceC{
    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementationC-methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");
    }
}
