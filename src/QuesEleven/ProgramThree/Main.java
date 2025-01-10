package QuesEleven.ProgramThree;

public class Main {
    public static void main(String[] args) {
        // 创建 AreaCalculable 对象
        Shape shape = new Shape();
        Shape clonedShape = shape.clone(); // 调用 AreaCalculable 的 clone 方法

        // 创建 Circle 对象
        Circle circle = new Circle();
        Circle clonedCircle = circle.clone(); // 调用 Circle 的 clone 方法

        // 多态：父类引用指向子类对象
        Shape myCircle = new Circle();
        Shape clonedMyCircle = myCircle.clone(); // 调用 Circle 的 clone 方法
    }
}
