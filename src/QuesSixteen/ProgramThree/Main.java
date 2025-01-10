package QuesSixteen.ProgramThree;
//编程题：
// 设计一个Car类，
// 其中包含Engine类的实例作为属性（组合关系）。
// 同时设计一个TrafficLight类，
// 其中包含Car类的集合作为属性（聚合关系）。
// 展示这两种关系在代码中的实现。
public class Main {
    public static void main(String[] args) {
        // 创建Car对象（组合关系）
        Car car1 = new Car();
        Car car2 = new Car();

        // 创建TrafficLight对象（聚合关系）
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.addCar(car1);
        trafficLight.addCar(car2);

        // 启动汽车
        car1.startCar();
        car2.startCar();

        // 交通灯信号变化，汽车停止
        trafficLight.signal();
    }
}
