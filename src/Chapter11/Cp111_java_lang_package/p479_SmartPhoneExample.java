package Chapter11.Cp111_java_lang_package;

public class p479_SmartPhoneExample {
    public static void main(String[] args) {
        p478_SmartPhone myPhone = new p478_SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
