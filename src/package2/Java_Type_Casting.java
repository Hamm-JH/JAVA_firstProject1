package package2;

public class Java_Type_Casting {
    public static void main(String[] args) {
        // 변수형의 연산 오류 예상시 컴파일 오류를 출력한다.
        // Example1: Widening Type Casting(error)
//        int num1 = 5004;
//        double num2 = 2.5;
//        int sum = num1 + num2;
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

//        // Example2: Widening Type Casting
//        int num1 = 5004;
//        double num2 = 2.5;
//        double sum = num1 + num2;
//        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        // Example: Narrowing Type Casting
        int num = 5004;
        double doubleNum = (double)num;
        System.out.println("The value of " + num + " after converting to the double is " + doubleNum);
        int convertedInt = (int) doubleNum;
        System.out.println("The value of " + doubleNum + " after converting to the int again is " + convertedInt);

    }
}
