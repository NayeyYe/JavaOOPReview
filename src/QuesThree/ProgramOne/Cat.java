package QuesThree.ProgramOne;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // 重写
    @Override
    public void makeSound() {
        System.out.println(name + "is meowing");
    }
}
