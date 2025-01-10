package QuesFour.ProgramFour;
// 编程题：
// 创建一个基类Animal和一个子类Bird，
// 重写Animal类中的makeSound方法。
public class Test {
    public static void main(String[] args) {
        // 创建两个对象
        // 一个Animal对象，一个bird对象
        Animal animal = new Animal();
        animal.makeSound();

        Bird bird = new Bird();
        bird.makeSound();
    }
}
