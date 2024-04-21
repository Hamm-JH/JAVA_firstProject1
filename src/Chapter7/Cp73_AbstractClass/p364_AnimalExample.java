package Chapter7.Cp73_AbstractClass;

public class p364_AnimalExample {
    public static void main(String[] args) {
        p364_Dog dog = new p364_Dog();
        p364_Cat cat = new p364_Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        // 변수의 자동 타입 변환
        p363_Animal animal = null;
        animal = new p364_Dog();
        animal.sound();
        animal = new p364_Cat();
        animal.sound();
        System.out.println("-----");

        // 메소드의 다형성
        animalSound(new p364_Dog());
        animalSound(new p364_Cat());
    }

    public static void animalSound(p363_Animal animal) {
        animal.sound();
    }
}
