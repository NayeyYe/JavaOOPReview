package QuesThree.ProgramFive;

public class Car extends Vehicle {
    // 重写 startEngine 方法
    @Override
    public void startEngine() {
        // 调用父类的 startEngine 方法
        super.startEngine();
        // 添加子类额外逻辑
        System.out.println("Engine started in Car");
    }
}
