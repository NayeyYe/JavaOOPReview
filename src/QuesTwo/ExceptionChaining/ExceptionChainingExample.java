package QuesTwo.ExceptionChaining;

public class ExceptionChainingExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            System.out.println("捕获到自定义异常: " + e.getMessage());
            System.out.println("原始异常: " + e.getCause());
        }
    }

    public static void method1() throws CustomException {
        try {
            method2();
        } catch (ArithmeticException e) {
            // 将 ArithmeticException 包装在 CustomException 中
            throw new CustomException("方法1中发生错误", e);
        }
    }

    public static void method2() {
        // 抛出一个 ArithmeticException
        int result = 10 / 0;
    }
}

// 自定义异常类
class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
