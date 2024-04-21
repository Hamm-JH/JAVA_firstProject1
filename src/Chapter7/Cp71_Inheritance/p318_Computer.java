package Chapter7.Cp71_Inheritance;

public class p318_Computer extends p318_Calculator{
    @Override
    double areaCircle(double r) {
        System.out.println("Computer 개체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
