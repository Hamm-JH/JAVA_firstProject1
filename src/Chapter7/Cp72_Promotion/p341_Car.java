package Chapter7.Cp72_Promotion;

public class p341_Car {
    p340_Tire frontLeftTire = new p340_Tire("앞왼쪽", 6);
    p340_Tire frontRightTire = new p340_Tire("앞오른쪽", 2);
    p340_Tire backleftTire = new p340_Tire("뒤왼쪽", 3);
    p340_Tire backRightTire = new p340_Tire("뒤오른쪽", 4);

    int run() {
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false) { stop(); return 1; }
        if(frontRightTire.roll()==false) { stop(); return 2; }
        if(backleftTire.roll()==false) { stop(); return 3; }
        if(backRightTire.roll()==false) { stop(); return 4; }
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
