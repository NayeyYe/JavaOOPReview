package QuesSix.ProgramThree;
//编程题：
// 在一个类中创建一个静态代码块和一个实例代码块，
// 并在其中初始化类变量和实例变量。
// 讨论这些变量的作用域。
public class Block {
    // 类变量
    private static int staticVar;

    // 实例变量
    private int instanceVar;

    // 静态代码块
    static {
        staticVar = 10;
        System.out.println("static block executed.staticVar = " + staticVar);
    }

    // 实例代码块
    {
        instanceVar = 20;
        System.out.println("instance block executed.staticVar = " + instanceVar);
    }

    // 构造器
    public Block() {
        System.out.println("block executed.");
    }

    // main
    public static void main(String[] args) {
        // 创建Block对象
        Block block1 = new Block();
        Block block2 = new Block();
    }
}
