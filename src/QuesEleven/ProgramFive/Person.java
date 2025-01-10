package QuesEleven.ProgramFive;

public class Person {
    private String name;

    // 构造方法：接受名字参数
    public Person(String name) {
        this.name = name;
        System.out.println("Person 构造方法被调用，name: " + this.name);
    }

    // 获取 name
    public String getName() {
        return name;
    }
}
