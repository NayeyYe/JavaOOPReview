package QuesEleven.ProgramTwo;

public class Car extends Vehicle {
    // 尝试重写 startEngine 方法并降低访问级别
    // 以下代码会导致编译错误
    /*
    @Override
    protected void startEngine() {
        System.out.println("Car 的引擎启动");
    }
    */

    // 正确方式：保持或提高访问级别
    @Override
    public void startEngine() {
        System.out.println("Car 的引擎启动");
    }
}
