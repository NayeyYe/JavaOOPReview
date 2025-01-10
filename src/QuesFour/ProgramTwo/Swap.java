package QuesFour.ProgramTwo;
// 编程题：编写一个方法swap，
// 接受两个整数参数并交换它们的值，
// 然后在主方法中测试这个方法。
public class Swap {
    // swap方法，交换两个整数的值
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside swap method：a = " + a + ", b = " + b);
    }

    // 测试
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before swap：x = " + x + ", y = " + y);

        // 调用swap方法
        swap(x, y);

        System.out.println("After swap：x = " + x + ", y = " + y);
    }

}
