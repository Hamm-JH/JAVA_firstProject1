package Chapter7.Cp72_Promotion;

public class p352_InstanceofExample {
    public static void method1(p351_Parent parent) {
        if(parent instanceof p351_Child) {
            p351_Child child = (p351_Child) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환되지 않음");
        }
    }

    public static void method2(p351_Parent parent) {
        p351_Child child = (p351_Child) parent;
        System.out.println("method2 - Child로 변환 성공");
    }

    public static void main(String[] args) {
        p351_Parent parentA = new p351_Child();
        method1(parentA);
        method2(parentA);

        p351_Parent parentB = new p351_Parent();
        method1(parentB);
        method2(parentB); // 예외 발생
    }
}
