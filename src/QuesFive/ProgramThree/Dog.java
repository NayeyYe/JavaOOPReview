package QuesFive.ProgramThree;

public class Dog extends Animal{
    // 构造器
    public Dog(String name) {
        super(name);
    }
    // 重写方法
    @Override
    public void makeSound() {
        System.out.println("The dog makes sound");
    }
}
