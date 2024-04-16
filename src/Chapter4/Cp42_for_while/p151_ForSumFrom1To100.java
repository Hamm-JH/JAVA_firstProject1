package Chapter4.Cp42_for_while;

public class p151_ForSumFrom1To100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1~100 합 : " + sum);
    }
}
