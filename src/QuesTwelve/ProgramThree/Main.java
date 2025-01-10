package QuesTwelve.ProgramThree;
//编程题：
// 创建一个方法，
// 接受Animal类型的参数并调用一个makeSound方法。
// 在子类中重写这个方法，
// 并在主方法中演示如何调用子类的特定实现。
public class Main {
    // 方法：接受 Animal 类型参数并调用 makeSound 方法
    public static void performAction(Animal animal) {
        animal.makeSound(); // 调用 makeSound 方法

        // 如果需要调用子类特有的方法，进行强制类型转换
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 强制类型转换
            dog.fetch(); // 调用 Dog 特有的方法
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal; // 强制类型转换
            cat.scratch(); // 调用 Cat 特有的方法
        }
    }

    public static void main(String[] args) {
        // 创建 Dog 和 Cat 对象
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // 调用 performAction 方法
        System.out.println("调用 Dog 的行为:");
        performAction(myDog);

        System.out.println("调用 Cat 的行为:");
        performAction(myCat);
    }
}
