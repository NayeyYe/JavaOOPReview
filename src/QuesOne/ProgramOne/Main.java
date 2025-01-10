package QuesOne.ProgramOne;

// 编写一个Java类，
// 包含一个private整数成员变量和一个public构造器，
// 该构造器初始化变量，
// 并提供一个protected方法来返回这个变量的值。
public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
        // 由于getMyVar是protected方法，只能在MyClass的子类或同一个包内访问
        // 假设Main类与MyClass在同一个包内
        System.out.println(obj.getMyVar());
    }
}