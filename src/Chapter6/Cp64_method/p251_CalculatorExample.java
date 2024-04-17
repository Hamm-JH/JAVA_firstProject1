package Chapter6.Cp64_method;

public class p251_CalculatorExample {
    public static void main(String[] args) {
        p250_Calculator myCalc = new p250_Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1: " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2: " + result2);

        myCalc.powerOff();
    }
}
