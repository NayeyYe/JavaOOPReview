package QuesFifteen.ProgramFive;

public class ScientificCalculator extends Calculator {
    // 方法重写：重写父类的整数加法方法，添加额外功能
    @Override
    public int add(int a, int b) {
        System.out.println("调用重写的整数加法方法");
        int result = super.add(a, b); // 调用父类的方法
        System.out.println("结果: " + result);
        return result;
    }

    // 方法重载：处理三个整数的加法
    public int add(int a, int b, int c) {
        System.out.println("调用三个整数的加法方法");
        return a + b + c;
    }
}
