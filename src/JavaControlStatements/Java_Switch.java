package JavaControlStatements;

public class Java_Switch {
    public static void switch1() {
        char grade = 'C';
        switch(grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }

    public static void switch2() {
        int grade = 3;

        switch(grade) {
            case 1 :
                System.out.println("Excellent!");
                break;
            case 2 :
            case 3 :
                System.out.println("Well done");
                break;
            case 4 :
                System.out.println("You passed");
            case 5 :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }

    public static void switch3() {
        String grade = "C";

        switch(grade) {
            case "A" :
                System.out.println("Excellent!");
                break;
            case "B" :
            case "C" :
                System.out.println("Well done");
                break;
            case "D" :
                System.out.println("You passed");
            case "F" :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }

    public static void main(String[] args) {
//        switch1();
//        switch2();
        switch3();
    }
}
