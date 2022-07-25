package First;

public class Application {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.voice();
        cow.voice();
        dog.voice();
    }
}
