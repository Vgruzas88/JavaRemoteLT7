package lt.sda.javaFundamentalsCoding.advanced.inheritance.animal_example;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat("blue", "miau", true);
        Dog dog = new Dog("Lenciuginis", "Au", true);

        System.out.println(cat.yieldVoice());
        System.out.println(dog.yieldVoice());
    }
}
