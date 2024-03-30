package JavaControlStatements;

public class Java_For_Loops {
    public static void for1() {
        for (int x=10; x<20; x++) {
            System.out.print("value of x : " + x);
            System.out.print("\n");
        }
    }

    public static void for2() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int index=0; index<numbers.length; index++) {
            System.out.print("value of item : " + numbers[index]);
            System.out.print("\n");
        }
    }

    public static void for3() {
        int x = 10;

        for( ;; ) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }
    }

    public static void nested_for() {
        int num = 1;
        int i = 1;

        for (num = 1; num<=10; num++) {
            System.out.print("Table of " + num + " is: ");
            for (i = 1; i<=10; i++) {
                System.out.print(num * i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        for1();
//        for2();
//        for3();
        nested_for();
    }
}
