package Chapter10.Cp101_ExceptionClass;

public class p447_ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String data1 = args[0]; // ArrayIndexOutOfBoundsException
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}
