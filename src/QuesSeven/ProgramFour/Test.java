package QuesSeven.ProgramFour;
//编程题：
// 在一个接口Calculator中定义一个静态方法add(int a, int b)。
// 在主方法中调用这个静态方法。
public class Test {
    public static void main(String[] args) {
        // 调用接口中的静态方法
        int result = Calculator.add(5, 10);
        System.out.println("Sum: " + result);
    }
}
