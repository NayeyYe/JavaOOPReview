package QuesThree.ProgramOne;

public class Animal {
    // 动物名字
    String name;

    // 构造方法
    public Animal(String name) {
        this.name = name;
    }

    // 方法：发出声音
    public void makeSound()
    {
        System.out.println(name + "is making a sound");
    }
}
