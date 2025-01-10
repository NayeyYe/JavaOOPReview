package QuesFifteen.ProgramFive;
//编程题：
// 创建一个类Calculator，
// 包含方法add(int a, int b)和add(double a, double b)，
// 展示方法重载
// 。然后在子类ScientificCalculator中重写add方法，
// 添加额外的功能。
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("整数加法结果: " + calculator.add(2, 3));
        System.out.println("浮点数加法结果: " + calculator.add(2.5, 3.5));

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        System.out.println("重写的整数加法结果: " + scientificCalculator.add(4, 5));
        System.out.println("三个整数的加法结果: " + scientificCalculator.add(4, 5, 6));
    }
}
