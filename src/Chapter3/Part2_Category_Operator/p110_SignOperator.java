package Chapter3.Part2_Category_Operator;

public class p110_SignOperator {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
//        byte result3 = -b; // java: incompatible types: possible lossy conversion from int to byte
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}
