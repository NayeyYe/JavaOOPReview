package QuesNine.ProgramThree;

public class Product {
    private String name;

    // 构造器
    public Product(String name) {
        this.name = name;
        // 在构造器中调用静态方法
        loadConfig();
        System.out.println("Product 构造器被调用，name: " + this.name);
    }

    // 静态方法：加载配置
    public static void loadConfig() {
        System.out.println("静态方法 loadConfig 被调用");
    }

    // 静态方法：创建 Product 对象
    public static Product createProduct(String name) {
        System.out.println("静态方法 createProduct 被调用");
        // 在静态方法中调用构造器
        return new Product(name);
    }

    // 输出实例对象name
    public String getName() {
        return name;
    }
}
