package QuesNine.ProgramTwo;

public class Person {
    // 非静态成员变量
    private String name;

    // 构造方法
    public Person(String name) {
        this.name = name;
    }

    // 静态方法：打印名字
    public static void printName(Person person) {
        // 通过对象访问非静态成员变量
        System.out.println("Name: " + person.name);
    }

    // 非静态方法：获取名字
    public String getName() {
        return name;
    }
}
