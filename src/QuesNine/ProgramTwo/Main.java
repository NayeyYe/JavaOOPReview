package QuesNine.ProgramTwo;
//编程题：
// 创建一个类Person，
// 包含一个非静态成员变量name
// 和一个静态方法printName(String name)。
// 展示如何在静态方法中访问非静态成员变量。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Person 对象
        Person person = new Person("Alice");

        // 调用静态方法，传入对象作为参数
        Person.printName(person);

        // 调用非静态方法
        System.out.println("Name via non-static method: " + person.getName());
    }
}
