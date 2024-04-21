package Chapter7.Cp71_Inheritance;

public class p316_StudentExample {
    public static void main(String[] args) {
        p316_Student student = new p316_Student("홍길동", "123456-1234567", 1);
        System.out.println("name: " + student.name);
        System.out.println("ssn: " + student.ssn);
        System.out.println("studentNo: " + student.studentNo);
    }
}
