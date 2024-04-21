package Chapter7.Cp73_AbstractClass;

public class p361_SmartPhone extends p360_Phone{
    public p361_SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
