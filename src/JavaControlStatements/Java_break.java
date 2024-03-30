package JavaControlStatements;

public class Java_break {

    public static void break1() {
        int x = 10;

        while( x<20 ) {
            if(x == 15) {
                break;
            }

            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        }
    }

    public static void break2() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int index=0; index<numbers.length; index++) {
            if(numbers[index] == 30) {
                break;
            }

            System.out.print("value of item : " + numbers[index]);
            System.out.print("\n");
        }
    }

    public static void break3() {
        int x = 10;

        while( true ) {
            System.out.print("value of x : " + x);
            x++;
            if(x == 15) {
                break;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
//        break1();
//        break2();
        break3();
    }
}
