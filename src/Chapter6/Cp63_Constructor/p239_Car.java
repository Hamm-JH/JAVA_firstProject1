package Chapter6.Cp63_Constructor;

public class p239_Car {
    // 필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자
    p239_Car() {

    }

    p239_Car(String model) {
        this.model = model;
    }

    p239_Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    p239_Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
