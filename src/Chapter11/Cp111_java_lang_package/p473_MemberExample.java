package Chapter11.Cp111_java_lang_package;

public class p473_MemberExample {
    public static void main(String[] args) {
        p473_Member obj1 = new p473_Member("blue");
        p473_Member obj2 = new p473_Member("blue");
        p473_Member obj3 = new p473_Member("red");

        if(obj1.equals(obj2)) {
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }

        if(obj1.equals(obj3)) {
            System.out.println("obj1과 obj3은 동등합니다.");
        } else {
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }
}
