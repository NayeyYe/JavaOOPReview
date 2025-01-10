package QuesFive.ProgramThree;
//编程题：
// 编写一个抽象类Animal，
// 包含一个构造器和一个抽象方法makeSound()。
// 创建一个子类Dog继承Animal并实现makeSound()方法。
public class Test {
    public static void main(String[] args) {
        // 创建Dog对象
        Dog dog = new Dog("John");
        // 调用makeSound方法
        dog.makeSound();
    }
}
