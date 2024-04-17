package Chapter6.Cp64_method;

public class p276_CalculatorExample {
    public static void main(String[] args) {
        double result1 = 10 * 10 * p276_Calculator.pi;
        int result2 = p276_Calculator.plus(10, 5);
        int result3 = p276_Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
