package QuesThree.ProgramOne;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    // 重写makeSound方法
    @Override
    public void makeSound() {
        System.out.println(name + "is barking");
    }
}
