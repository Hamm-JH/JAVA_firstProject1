package Chapter7.Cp71_Inheritance;

public class p324_SportsCar extends p323_Car{
    @Override
    public void speedUp() { speed += 10; }

    // 재정의할 수 없음
//    @Override
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        speed = 0;
//    }
}
