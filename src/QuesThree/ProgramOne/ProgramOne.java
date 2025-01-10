package QuesThree.ProgramOne;
// 编程题
// 创建一个基类Animal和两个继承自Animal的子类Dog和Cat。
// 每个类都有makeSound方法。
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
