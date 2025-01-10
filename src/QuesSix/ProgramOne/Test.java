package QuesSix.ProgramOne;
// 编程题：编写一个方法，
// 该方法接受两个整数参数并返回它们的和。
// 讨论局部变量a和b的作用域。
public class Test {
    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println(add(num1, num2));
    }
}
