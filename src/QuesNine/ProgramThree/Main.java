package QuesNine.ProgramThree;
//编程题：
// 创建一个类Product，
// 包含一个静态方法loadConfig()和一个构造器。
// 在构造器中调用loadConfig()方法，
// 并在静态方法中创建Product对象。
public class Main {
    public static void main(String[] args) {
        // 在静态方法中创建 Product 对象
        Product product = Product.createProduct("Laptop");

        // 输出对象信息
        System.out.println("Product name: " + product.getName());
    }
}
