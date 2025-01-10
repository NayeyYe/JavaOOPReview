package QuesSeven.ProgramThree;
//编程题：
// 创建一个接口Printable，
// 包含一个方法print()。
// 创建一个抽象类Document也包含一个方法print()。
// 实现Printable接口和继承Document的两个不同类。
public class Test {
    public static void main(String[] args) {
        // 创建Book和Report对象
        Printable book = new Book();
        Printable report = new Report();

        // 调用print方法
        book.print(); // 输出: Printing a book
        report.print(); // 输出: Printing a report
    }
}
