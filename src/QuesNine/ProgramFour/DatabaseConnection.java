package QuesNine.ProgramFour;
// 单例类 DatabaseConnection
public class DatabaseConnection {
    // 类变量：保存唯一的实例
    private static DatabaseConnection instance;

    // 私有构造器，只有在本类才能创建对象
    private DatabaseConnection() {
        System.out.println("DatabaseConnection 实例被创建");
    }

    // 静态方法：提供全局访问点
    public static DatabaseConnection getInstance() {
        // 如果实例不存在，就创建一个实例
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        // 如果有实例，就返回唯一的实例
        return instance;
    }

    // 实例方法
    public void connect(){
        System.out.println("连接数据库");
    }
}
