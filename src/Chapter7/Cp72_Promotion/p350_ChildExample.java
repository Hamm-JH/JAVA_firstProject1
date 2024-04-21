package Chapter7.Cp72_Promotion;

public class p350_ChildExample {
    public static void main(String[] args) {
        p349_Parent parent = new p349_Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        
        /*
        // 불가능
        parent.field2 = "data2";
        parent.method3();
         */

        p349_Child child = (p349_Child) parent;
        child.field2 = "yyy";
        child.method3();
    }
}
