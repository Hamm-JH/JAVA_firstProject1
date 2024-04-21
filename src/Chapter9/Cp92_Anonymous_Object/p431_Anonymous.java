package Chapter9.Cp92_Anonymous_Object;

public class p431_Anonymous {
    p431_RemoteControl field = new p431_RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    void method1() {
        p431_RemoteControl localVar = new p431_RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };
        // 로컬 변수 사용
        localVar.turnOn();
    }

    void method2(p431_RemoteControl rc) {
        rc.turnOn();
    }
}
