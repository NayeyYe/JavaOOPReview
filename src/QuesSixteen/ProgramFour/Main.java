package QuesSixteen.ProgramFour;
//编程题：
// 根据以下描述绘制一个UML类图：
// 一个Library类包含Book类的集合，
// Book类有一个String类型的title属性和一个printInfo()方法。
// Library类有一个checkOutBook(Book book)方法。
//        +-------------------+        +-------------------+
//        |     Library       |        |       Book        |
//        +-------------------+        +-------------------+
//        | - books: List<Book>|<>------| - title: String   |
//        +-------------------+        +-------------------+
//        | + checkOutBook(   |        | + printInfo()     |
//        |   book: Book): void|        +-------------------+
//        +-------------------+
public class Main {
    public static void main(String[] args) {
        // 创建Book对象
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("1984");

        // 创建Library对象
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // 打印书籍信息
        book1.printInfo();
        book2.printInfo();

        // 借出书籍
        library.checkOutBook(book1);
    }
}
