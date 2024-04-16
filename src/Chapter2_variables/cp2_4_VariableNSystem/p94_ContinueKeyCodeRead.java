package Chapter2_variables.cp2_4_VariableNSystem;

public class p94_ContinueKeyCodeRead {
    public static void main(String[] args) throws Exception{
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }
    }
}
