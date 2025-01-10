package QuesEight.ProgramFive;

public class Employee extends Person {
    private int employeeId;

    // Employee 的构造器，接受一个名字和一个员工ID参数
    public Employee(String name, int employeeId) {
        // 调用父类 Person 的构造器
        super(name);
        this.employeeId = employeeId;
        System.out.println("Employee 构造器被调用，employeeId: " + this.employeeId);
    }

    // 获取 employeeId
    public int getEmployeeId() {
        return employeeId;
    }
}
