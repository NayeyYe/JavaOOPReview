package QuesFifteen.ProgramFour;

public class DatabaseConnection {
    // 私有静态实例变量
    private static DatabaseConnection instance;

    // 私有构造函数，防止外部实例化
    private DatabaseConnection() {
        System.out.println("数据库连接已创建。");
    }

    // 公共静态方法，提供全局访问点
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // 模拟数据库连接操作
    public void connect() {
        System.out.println("连接到数据库。");
    }
}
