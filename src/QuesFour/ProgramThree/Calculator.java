package QuesFour.ProgramThree;
//编程题：在一个类Calculator中实现三个重载的add方法，
// 分别接受两个整数、两个浮点数和三个整数作为参数。
public class Calculator {
    // 重载方法：接受两个整数
    public int add(int a, int b) {
        return a + b;
    }

    // 重载方法：接受两个浮点数
    public double add(double a, double b) {
        return a + b;
    }

    // 重载方法：接受三个整数
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 测试
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 调用重载的三个add方法
        System.out.println("Sum of 2 and 3: " + calculator.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calculator.add(2.5, 3.5));
        System.out.println("Sum of 2, 3, and 4: " + calculator.add(2, 3, 4));
    }
}
