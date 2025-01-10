package QuesEight.ProgramFour;

public class Book {
    private String title;
    private String author;
    private int year;

    // 构造器1：接受书名和作者
    public Book(String title, String author) {
        // 调用另一个构造器，默认出版年份为 -1
        this(title, author, -1);
    }

    // 构造器2：接受书名、作者和出版年份
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        System.out.println("创建了一本书: " + this);
    }

    // 重写 toString 方法，方便打印对象信息
    @Override
    public String toString() {
        return "书名: " + title + ", 作者: " + author + ", 出版年份: " + (year == -1 ? "未知" : year);
    }
}
