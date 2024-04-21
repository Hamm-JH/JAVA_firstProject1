package Chapter7.Cp71_Inheritance;

public class p319_ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        p318_Calculator calculator = new p318_Calculator();
        System.out.println("원면적: " + calculator.areaCircle(r));
        System.out.println();

        p318_Computer computer = new p318_Computer();
        System.out.println("원면적: " + computer.areaCircle(r));
    }
}
