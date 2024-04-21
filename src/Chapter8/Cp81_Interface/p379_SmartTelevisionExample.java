package Chapter8.Cp81_Interface;

public class p379_SmartTelevisionExample {
    public static void main(String[] args) {
        p378_SmartTelevision tv = new p378_SmartTelevision();

        p373_RemoteControl rc = tv;
        p378_Searchable searchable = tv;
    }
}
