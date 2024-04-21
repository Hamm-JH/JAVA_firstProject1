package Chapter7.Cp72_Promotion;

public class p337_ChildExample {
    public static void main(String[] args) {
        p336_Child child = new p336_Child();

        p336_Parent parent = child;
        parent.method1();
        parent.method2();
//        parent.method3(); // 호출 불가능
    }
}
