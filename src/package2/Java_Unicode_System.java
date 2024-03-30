package package2;

public class Java_Unicode_System {
    // 1. Using Unicode Escape Sequences
    public static void unicodeCharacterDemo() {
        // Unicode escape sequence
        char unicodeChar = '\u0041';
        System.out.println("Stored Unicode Character: " + unicodeChar);
    }

    // 2. Storing Unicode Values Directly
    public static void unicodeCharacterDemo2() {
        char letterA = '\u0041';
        char letterSigma = '\u03A3';
        char copyrightSymbol = '\u00A9';

        char letterZ = 'Z';
        char letterOmega = 'Ω';
        char registeredSymbol = '®';

        System.out.println("Stored Unicode Characters using Escape Sequences:");
        System.out.println("Letter A: " + letterA);
        System.out.println("Greek Capital Letter Sigma: " + letterSigma);
        System.out.println("Copyright Symbol: " + copyrightSymbol);
        System.out.println("\nStored Unicode Characters Directly:");
        System.out.println("Letter Z: " + letterZ);
        System.out.println("Greek Capital Letter Omega: " + letterOmega);
        System.out.println("Registered Symbol: " + registeredSymbol);
    }

    public static void unicodeCharacterDemo3() {
        // Storing Unicode characters using escape sequences
        char letterA = '\u0041';
        char letterSmallA = '\u0061';
        // Storing Unicode characters directly
        char letterB = 'B';

        // Manipulating the stored Unicode characters
        int difference = letterA - letterSmallA;
        char letterC = (char) (letterB + difference);
        char letterSmallC = (char) (letterC + 32);
        // Printing the manipulated Unicode characters
        System.out.println("Manipulated Unicode Characters:");
        System.out.println("Difference between A and a: " + difference);
        System.out.println("Calculated Letter C: " + letterC);
        System.out.println("Calculated Letter c: " + letterSmallC);
    }

    public static void main (String[] args) {
//        unicodeCharacterDemo();
//        unicodeCharacterDemo2();
        unicodeCharacterDemo3();
    }
}
