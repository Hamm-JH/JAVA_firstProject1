package Chapter6.Cp63_Constructor;

public class p242_Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    p242_Car() {

    }

    p242_Car(String model) {
        this(model, "은색", 250);
    }

    p242_Car(String model, String color) {
        this(model, color, 250);
    }

    p242_Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
