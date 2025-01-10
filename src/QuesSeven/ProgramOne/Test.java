package QuesSeven.ProgramOne;

//编程题：
// 定义一个接口Flyable，
// 包含一个方法fly()。
// 创建两个类Bird和Airplane实现这个接口，
// 并在主方法中创建它们的实例，调用fly()方法。
public class Test {
    public static void main(String[] args) {
        // 创建Bird和Airplane对象
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        // 调用fly方法
        bird.fly(); // 输出: Bird is flying
        airplane.fly(); // 输出: Airplane is flying
    }
}
