package nl.workingspirit.schilderen.zoo;

public class Application {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();

        Animal b = new Mammal();
        b.eat();
    }
}
