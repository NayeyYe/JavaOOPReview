package QuesEleven.ProgramOne;
//编程题：
// 定义一个基类Animal和一个子类Dog。
// 在Animal类中定义一个方法makeSound()，
// 然后在Dog类中重写这个方法。
public class Main {
    public static void main(String[] args) {
        // 创建 Animal 对象
        Animal animal = new Animal();
        animal.makeSound(); // 调用 Animal 的 makeSound 方法

        // 创建 Dog 对象
        Dog dog = new Dog();
        dog.makeSound(); // 调用 Dog 的 makeSound 方法

        // 多态：父类引用指向子类对象
        Animal myDog = new Dog();
        myDog.makeSound(); // 调用 Dog 的 makeSound 方法
    }
}
