package QuesOne.ProgramFive;

//创建一个Java接口，
// 声明一个abstract方法calculateArea，
// 然后在一个实现该接口的类中用final关键字实现这个方法。
public class Main
{
    public static void main(String[] args) {
        // 创建 Circle 的实例
        Circle circle = new Circle(5.0);

        // 调用 AreaCalculable 方法计算面积
        System.out.println("Circle Area: " + circle.calculateArea());
        // 输出: Circle Area: 78.53981633974483
    }
}
