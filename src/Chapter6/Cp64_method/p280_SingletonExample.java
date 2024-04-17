package Chapter6.Cp64_method;

public class p280_SingletonExample {
    public static void main(String[] args) {
        /*
        p280_Singleton obj1 = new p280_Singleton(); // java: p280_Singleton() has private access in Chapter6.Cp64_method.p280_Singleton
        p280_Singleton obj2 = new p280_Singleton();
         */

        p280_Singleton obj1 = p280_Singleton.getInstance();
        p280_Singleton obj2 = p280_Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
