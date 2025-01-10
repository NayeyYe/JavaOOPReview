package QuesEight.ProgramFour;
//编程题：
// 创建一个类Book，
// 包含两个构造器。
// 一个接受书名和作者，
// 另一个接受书名、作者和出版年份。
// 使用this关键字在这两个构造器之间进行调用。
public class Main {
    public static void main(String[] args) {
        // 使用构造器1创建 Book 对象
        Book book1 = new Book("Java 编程思想", "Bruce Eckel");

        // 使用构造器2创建 Book 对象
        Book book2 = new Book("Effective Java", "Joshua Bloch", 2018);
    }
}
