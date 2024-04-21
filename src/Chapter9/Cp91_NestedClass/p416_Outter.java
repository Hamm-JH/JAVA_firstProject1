package Chapter9.Cp91_NestedClass;

public class p416_Outter {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(p416_Outter.this.field);
            p416_Outter.this.method();
        }
    }
}
