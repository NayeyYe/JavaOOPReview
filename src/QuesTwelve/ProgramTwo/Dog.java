package QuesTwelve.ProgramTwo;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("狗在汪汪叫");
    }

    // Dog 类特有的方法
    public void fetch() {
        System.out.println("狗在捡球");
    }
}
