package Chapter11.Cp111_java_lang_package;

import java.util.HashMap;

public class p475_KeyExample {
    public static void main(String[] args) {
        HashMap<p475_Key, String> hashMap = new HashMap<p475_Key, String>();

        // 식별키 new p475_Key(1)로 "홍길동"을 저장함
        hashMap.put(new p475_Key(1), "홍길동");

        // 식별키 new p475_Key(1)로 "홍길동"을 읽어옴
        String value = hashMap.get(new p475_Key(1));
        System.out.println(value);
    }
}
