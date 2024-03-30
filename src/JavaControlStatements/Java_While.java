package JavaControlStatements;

public class Java_While {
    public static void while1() {
        int x = 10;

        while( x<20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
    }

    public static void while2() {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;

        while( index<5 ) {
            System.out.print("value of item : " + numbers[index]);
            index++;
            System.out.print("\n");
        }
    }

    public static void while3() {
        int x = 10;

        while( true ) {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
//        while1();
//        while2();
        while3();
    }
}
