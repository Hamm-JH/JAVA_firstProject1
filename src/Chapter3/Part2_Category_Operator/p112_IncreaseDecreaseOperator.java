package Chapter3.Part2_Category_Operator;

public class p112_IncreaseDecreaseOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("----------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("----------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
