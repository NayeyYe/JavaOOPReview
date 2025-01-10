package QuesNine.ProgramFour;

import java.util.concurrent.SynchronousQueue;

//编程题：
// 设计一个单例类DatabaseConnection，
// 包含一个类变量instance和一个静态方法getInstance()。
// 确保getInstance()方法返回类的唯一实例。
public class Main {
    public static void main(String[] args) {
        // 获取DatabaseConnection实例
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        // 调用实例方法
        databaseConnection1.connect();
        databaseConnection2.connect();

        // 检查是不是同一个实例
        System.out.println("databaseConnection1 和 databaseConnection2 是同一个实例: " + (databaseConnection1 == databaseConnection2));
    }
}
