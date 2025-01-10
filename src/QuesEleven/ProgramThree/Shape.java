package QuesEleven.ProgramThree;

public class Shape {
    // 方法：返回 AreaCalculable 类型的克隆对象
    public Shape clone() {
        System.out.println("克隆一个 AreaCalculable 对象");
        return new Shape();
    }
}
