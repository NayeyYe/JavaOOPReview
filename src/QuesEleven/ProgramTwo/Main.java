package QuesEleven.ProgramTwo;
//编程题：
// 创建一个基类Vehicle，
// 其中包含一个startEngine()方法。
// 然后创建一个子类Car，
// 重写startEngine()方法，
// 并尝试降低访问级别。
public class Main {
    public static void main(String[] args) {
        // 创建 Vehicle 对象
        Vehicle vehicle = new Vehicle();
        vehicle.startEngine(); // 调用 Vehicle 的 startEngine 方法

        // 创建 Car 对象
        Car car = new Car();
        car.startEngine(); // 调用 Car 的 startEngine 方法
    }
}
