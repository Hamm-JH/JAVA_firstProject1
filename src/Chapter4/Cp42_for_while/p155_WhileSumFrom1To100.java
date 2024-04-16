package Chapter4.Cp42_for_while;

public class p155_WhileSumFrom1To100 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while(i<=100) {
            sum += i;
            i++;
        }

        System.out.println("1~" + (i-1) + " 합 " + sum);
    }
}
