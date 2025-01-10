package QuesFour.ProgramFour;

public class Bird extends Animal{
    // 重写父类Animal的makeSound方法
    @Override
    public void makeSound() {
        System.out.println("Bird Chirps");
    }
}
