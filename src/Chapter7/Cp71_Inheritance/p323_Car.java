package Chapter7.Cp71_Inheritance;

public class p323_Car {
    public int speed;

    public void speedUp() { speed += 1; }

    // final 메소드
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
