package Chapter6.Cp64_method;

public class p265_CalculatorExample {
    public static void main(String[] args) {
        p265_Calculator myCalcu = new p265_Calculator();

        double result1 = myCalcu.areaRectangle(10);

        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이=" + result1);
        System.out.println("직사각형 넓이=" + result2);
    }
}
