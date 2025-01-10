package QuesSix.ProgramFive;

public class Employee extends Person {
    private String department;

    // 构造器
    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    // 重写getName方法
    @Override
    public String getName() {
        // 使用super调用父类的getName方法
        return super.getName() + ", Department： " + department;
    }
}
