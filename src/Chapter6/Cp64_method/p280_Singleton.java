package Chapter6.Cp64_method;

public class p280_Singleton {
    private static p280_Singleton singleton = new p280_Singleton();

    private p280_Singleton() {}

    static p280_Singleton getInstance() {
        return singleton;
    }
}
