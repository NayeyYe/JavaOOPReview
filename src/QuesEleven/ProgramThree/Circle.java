package QuesEleven.ProgramThree;

public class Circle extends Shape {
    // 重写 clone 方法，返回 Circle 类型
    @Override
    public Circle clone() {
        System.out.println("克隆一个 Circle 对象");
        return new Circle();
    }
}
