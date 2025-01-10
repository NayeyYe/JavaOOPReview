package QuesTwelve.ProgramFive;
//编程题：
// 编写一个程序，
// 尝试将一个Object类型的变量强制类型转换为String，
// 并处理可能出现的ClassCastException。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Object 类型的变量
        Object obj = new Integer(10);

        // 尝试将 Object 类型强制转换为 String
        try {
            String str = (String) obj; // 强制类型转换
            System.out.println("转换后的字符串: " + str);
        } catch (ClassCastException e) {
            // 捕获并处理 ClassCastException
            System.out.println("类型转换失败: " + e.getMessage());
        }

        // 使用 instanceof 进行安全类型转换
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("安全转换后的字符串: " + str);
        } else {
            System.out.println("对象不是 String 类型，无法安全转换");
        }
    }
}
