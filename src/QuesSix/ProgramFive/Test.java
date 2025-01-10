package QuesSix.ProgramFive;
//编程题：
// 创建一个基类Person和一个子类Employee。
// 在Person类中定义一个getName()方法，
// 在Employee类中重写这个方法，
// 并使用super.getName()来调用基类方法。
// 讨论this和super如何影响方法调用。
public class Test {
    public static void main(String[] args) {
        // 创建Employee对象
        Employee employee = new Employee("John Doe", "Engineering");

        // 调用getName方法
        System.out.println(employee.getName());
    }
}
