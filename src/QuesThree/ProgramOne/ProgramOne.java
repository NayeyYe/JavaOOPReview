package QuesThree.ProgramOne;

public class ProgramOne {
    public static void main(String[] args) {
        // 创建Animal对象
        Animal animal = new Animal("Generic Animal");
        animal.makeSound();

        // 创建Dog对象
        Dog dog = new Dog("Alice");
        dog.makeSound();

        // 创建Cat对象
        Cat cat = new Cat("Bob");
        cat.makeSound();
    }
}
