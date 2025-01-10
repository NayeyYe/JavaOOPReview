package QuesSeven.ProgramTwo;
//编程题：
// 在一个接口Chargeable中定义一个默认方法charge()。
// 实现这个接口，
// 并在实现类中覆盖这个方法。
public class Test {
    public static void main(String[] args) {
        // 创建Phone和Laptop对象
        Chargeable phone = new Phone();
        Chargeable laptop = new Laptop();

        // 调用charge方法
        phone.charge(); // 输出: Phone is charging...
        laptop.charge(); // 输出: Charging in progress...
    }
}
