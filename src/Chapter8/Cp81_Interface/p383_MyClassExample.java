package Chapter8.Cp81_Interface;

public class p383_MyClassExample {
    public static void main(String[] args) {
        System.out.println("1)-----");

        p382_MyClass myClass1 = new p382_MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)-----");

        p382_MyClass myClass2 = new p382_MyClass(new p375_Audio());

        System.out.println("3)-----");

        p382_MyClass myClass3 = new p382_MyClass();
        myClass3.methodA();

        System.out.println("4)-----");

        p382_MyClass myClass4 = new p382_MyClass();
        myClass4.methodB(new p374_Television());
    }
}
