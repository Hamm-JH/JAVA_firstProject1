package Chapter6.Cp64_method;

public class p282_PersonExample {
    public static void main(String[] args) {
        p281_Person p1 = new p281_Person("123456-1234567", "홍길동");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

//        p1.nation = "usa"; // java: cannot assign a value to final variable nation
//        p1.ssn = "654321-7654321";
        p1.name = "홍삼원";
    }
}
