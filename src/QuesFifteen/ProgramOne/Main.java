package QuesFifteen.ProgramOne;
//编程题：
// 设计一个抽象类Shape，
// 包含一个抽象方法calculateArea()，
// 然后创建两个子类Circle和Rectangle实现这个抽象方法。
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayArea(); // 输出圆的面积
        rectangle.displayArea(); // 输出矩形的面积
    }
}
