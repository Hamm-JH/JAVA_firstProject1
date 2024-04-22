package Chapter11.Cp111_java_lang_package;

public class p480_ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                System.exit(0);
//                break;
            }
        }

        System.out.println("마무리 코드");
    }
}
