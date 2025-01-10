package QuesThree.ProgramThree;
// 编程题
// 在Animal类中定义一个display方法，
// 并在Dog和Cat类中重写这个方法。
// 同时，在Animal类中重载display方法。
public class ProgramThree {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.display();
        animal.display("Hello!");

        Dog dog = new Dog();
        dog.display();

        Cat cat = new Cat();
        cat.display();
    }
}
