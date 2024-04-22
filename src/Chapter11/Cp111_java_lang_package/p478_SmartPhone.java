package Chapter11.Cp111_java_lang_package;

public class p478_SmartPhone {
    private String company;
    private String os;

    public p478_SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return company + ", " + os;
    }
}
