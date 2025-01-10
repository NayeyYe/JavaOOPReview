package QuesFifteen.ProgramFive;

public class Calculator {
    // 方法重载：处理整数加法
    public int add(int a, int b) {
        System.out.println("调用整数加法方法");
        return a + b;
    }

    // 方法重载：处理浮点数加法
    public double add(double a, double b) {
        System.out.println("调用浮点数加法方法");
        return a + b;
    }
}
