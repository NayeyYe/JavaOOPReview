package QuesSix.ProgramFour;
// 编程题：
// 编写一个方法，
// 该方法接受一个字符串参数，
// 并在方法内部创建一个同名的局部变量。
// 讨论参数和局部变量的作用域和关系。
public class Scope {
    // 方法 exampleMethod，接受一个字符串参数
    public static void exampleMethod(String param) {
        // 方法参数 param 的作用域仅限于 exampleMethod 内部
        System.out.println("Parameter value: " + param);

        // 创建一个同名的局部变量
        // 这里会报错，因为不允许
        // String param = "Local Value"; // 局部变量遮蔽了方法参数
        System.out.println("Local variable value: " + "不可以，报错");
    }

    // 测试代码
    public static void main(String[] args) {
        // 调用 exampleMethod
        exampleMethod("Parameter Value");
    }
}
