package Chapter11.Cp111_java_lang_package;

public class p475_Key {
    public int number;

    public p475_Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof p475_Key) {
            p475_Key compareKey = (p475_Key) obj;
            if(this.number == compareKey.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
