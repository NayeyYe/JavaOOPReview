package QuesNine.ProgramFive;
//编程题：
// 创建一个基类Shape和一个子类Circle。
// Shape类包含一个静态方法calculateArea()。
// 在Circle类中重写这个方法，并在主方法中调用这两个方法。
public class Main {
    public static void main(String[] args) {
        // 调用 AreaCalculable 的静态方法
        Shape.calculateArea();

        // 调用 Circle 的静态方法
        Circle.calculateArea();

        // 通过父类引用调用静态方法
        Shape shape = new Circle();
        Shape.calculateArea(); // 注意：这里调用的是 AreaCalculable 的静态方法
    }
}
