package QuesSixteen.ProgramOne;
//编程题：
// 定义一个接口Flyable，
// 包含一个方法fly()。
// 创建两个类Bird和Airplane实现这个接口，
// 并在主方法中创建它们的实例，调用fly()方法。
public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.fly();
        airplane.fly();
    }
}
