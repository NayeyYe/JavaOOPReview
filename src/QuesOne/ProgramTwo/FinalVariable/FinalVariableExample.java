package QuesOne.ProgramTwo.FinalVariable;

// final变量
// 用于声明一个常量，一旦赋值后，其值不能被修改。
public class FinalVariableExample {
    public static void main(String[] args) {
        // 声明一个final变量
        final int MAX_VALUE = 100;
        // MAX_VALUE = 200; // 这一行会报错，因为final定义的变量不能被重新赋值
        System.out.println("Max Value:" + MAX_VALUE);
    }
}
