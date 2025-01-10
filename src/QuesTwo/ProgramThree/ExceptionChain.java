package QuesTwo.ProgramThree;

public class ExceptionChain {
    public static void main(String[] args) {
        try {
            // 调用可能抛出异常的方法
            method1();
        } catch (MyCustomException e) {
            // 捕获并处理自定义异常
            System.out.println("捕获到自定义异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause());
        }
    }

    public static void method1() throws MyCustomException {
        try {
            // 调用可能抛出异常的方法
            method2();
        } catch (ArithmeticException e) {
            // 将 ArithmeticException 包装在 MyCustomException 中
            throw new MyCustomException("方法1中发生错误", e);
        }
    }

    public static void method2() {
        // 抛出一个 ArithmeticException
        int result = 10 / 0;
    }
}
