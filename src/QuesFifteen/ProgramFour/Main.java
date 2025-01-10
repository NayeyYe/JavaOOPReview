package QuesFifteen.ProgramFour;

// 编程题：
// 实现单例模式，
// 创建一个DatabaseConnection类，
// 确保只能创建一个数据库连接实例。
// 然后实现工厂模式，
// 创建一个ShapeFactory类，
// 用于生成不同类型的Shape对象。
public class Main {
    public static void main(String[] args) {
        // 测试单例模式
        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance();
        dbConnection1.connect();
        System.out.println("dbConnection1 == dbConnection2: " + (dbConnection1 == dbConnection2));

        // 测试工厂模式
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        if (circle != null) {
            circle.draw();
        }
        if (rectangle != null) {
            rectangle.draw();
        }
    }
}
