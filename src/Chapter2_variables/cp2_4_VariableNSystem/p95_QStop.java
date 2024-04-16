package Chapter2_variables.cp2_4_VariableNSystem;

public class p95_QStop {
    public static void main(String[] args) throws Exception{
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            if(keyCode == 113) {
                break;
            }
        }

        System.out.println("종료");
    }
}
