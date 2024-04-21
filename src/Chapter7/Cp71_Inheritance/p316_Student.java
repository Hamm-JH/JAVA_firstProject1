package Chapter7.Cp71_Inheritance;

public class p316_Student extends p315_People{
    public int studentNo;

    public p316_Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
