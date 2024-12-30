package QuesOne.ProgramTwo;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public final double calculateArea() {
        return Math.PI * radius * radius;
    }
}
