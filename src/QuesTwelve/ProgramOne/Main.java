package QuesTwelve.ProgramOne;
//编程题：
// 编写一个Java程序，
// 将Integer对象转换为int基本类型，
// 并演示自动拆箱的过程。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Integer 对象
        Integer numObj = 42;

        // 自动拆箱：将 Integer 对象转换为 int 基本类型
        int num = numObj;

        // 输出结果
        System.out.println("Integer 对象的值: " + numObj);
        System.out.println("int 基本类型的值: " + num);

        // 演示自动拆箱在表达式中的使用
        int result = numObj + 10;
        System.out.println("自动拆箱后的计算结果: " + result);
    }
}
