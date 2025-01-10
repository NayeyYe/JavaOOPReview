package QuesEight.ProgramFive;

public class Person {
    private String name;

    // Person 的构造器，接受一个名字参数
    public Person(String name) {
        this.name = name;
        System.out.println("Person 构造器被调用，name: " + this.name);
    }

    // 获取 name
    public String getName() {
        return name;
    }
}
