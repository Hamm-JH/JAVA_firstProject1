package Chapter8.Cp81_Interface;

public class p382_MyClass {
    p373_RemoteControl rc = new p374_Television();

    p382_MyClass() {}

    p382_MyClass(p373_RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        p373_RemoteControl rc = new p375_Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(p373_RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
