package QuesSixteen.ProgramFive;
//编程题：
// 创建一个抽象类Shape，
// 包含一个抽象方法draw()。
// 然后创建一个接口Colorable，
// 包含一个方法setColor(String color)。
// 实现这两个抽象概念的Circle类，
// 它既是一个Shape也是一个Colorable。
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw(); // 调用Shape类的抽象方法
        circle.setColor("红色"); // 调用Colorable接口的方法
    }
}
