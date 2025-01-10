package QuesTwelve.ProgramTwo;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("猫在喵喵叫");
    }

    // Cat 类特有的方法
    public void scratch() {
        System.out.println("猫在抓挠");
    }
}
