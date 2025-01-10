package QuesEight.ProgramTwo;

public class Animal {
    private String name;

    // Animal的构造器
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal created");
    }

    // 获取name
    public String getName() {
        return name;
    }
}
