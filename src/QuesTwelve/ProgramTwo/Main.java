package QuesTwelve.ProgramTwo;
//编程题：
// 创建一个基类Animal和两个子类Dog和Cat。
// 编写代码演示如何将Animal类型的对象向下转型为Dog类型。
public class Main {
    public static void main(String[] args) {
        // 向上转型
        Animal animal = new Dog();
        animal.makeSound(); // 调用 Dog 的 makeSound 方法

        // 向下转型
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // 强制类型转换
            dog.fetch(); // 调用 Dog 特有的方法
        }

        // 错误的向下转型示例
        Animal anotherAnimal = new Cat();
        if (anotherAnimal instanceof Dog) {
            Dog dog = (Dog) anotherAnimal; // 这里不会执行，因为 anotherAnimal 是 Cat 类型
        } else {
            System.out.println("anotherAnimal 不是 Dog 类型，无法向下转型");
        }
    }
}
