package Chapter3.Part2_Category_Operator;

public class p117_CharOperation {
    public static void main(String[] args) {
        char c1 = 'A' + 1;
        char c2 = 'A';
//        char c3 = c2 + 1; // java: incompatible types: possible lossy conversion from int to char
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        
    }
}
