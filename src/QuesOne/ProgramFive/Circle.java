package QuesOne.ProgramFive;

public class Circle implements AreaCalculable {
    private double radius;

    // 构造器
    public Circle(double radius) {
        this.radius = radius;
    }

    // 用final关键字实现calculateArea方法
    @Override
    public final double calculateArea() {
        return Math.PI * radius * radius;
    }
}
