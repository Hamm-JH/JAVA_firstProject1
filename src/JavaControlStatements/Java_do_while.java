package JavaControlStatements;

public class Java_do_while {

    public static void do_while1() {
        int x = 10;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }while( x<20 );
    }

    public static void do_while2() {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 0;

        do {
            System.out.print("value of item : " + numbers[index]);
            index++;
            System.out.print("\n");
        }while( index<5 );
    }

    public static void do_while3() {
        int x = 10;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }while( true );
    }

    public static void main(String[] args) {
//        do_while1();
//        do_while2();
        do_while3();
    }
}
