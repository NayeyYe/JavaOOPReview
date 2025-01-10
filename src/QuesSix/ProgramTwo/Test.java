package QuesSix.ProgramTwo;
//编程题：
// 创建一个类Counter，
// 包含一个实例变量count和一个类变量total。
// 编写方法来增加count和total的值，
// 并在主方法中演示它们的作用域。
public class Test {
    public static void main(String[] args) {
        // 创建两个Counter对象
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        // 增加count和total的值
        counter1.increment();
        counter2.increment();
        counter2.increment();

        // 输出count和total的值
        System.out.println("Counter1 count: " + counter1.getCount()); // 输出: 1
        System.out.println("Counter2 count: " + counter2.getCount()); // 输出: 2
        System.out.println("Total count: " + Counter.getTotal()); // 输出: 3
    }
}
