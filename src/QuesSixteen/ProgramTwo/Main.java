package QuesSixteen.ProgramTwo;
//编程题：
// 创建一个基类Animal和一个子类Dog。
// Animal类有一个方法makeSound()，
// 在Dog类中重写这个方法。
// 创建一个Animal数组，
// 包含Dog对象，并调用makeSound()方法。
public class Main {
    public static void main(String[] args) {
        // 创建一个Animal数组，包含Dog对象
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Dog();

        // 调用makeSound()方法，展示多态性
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
