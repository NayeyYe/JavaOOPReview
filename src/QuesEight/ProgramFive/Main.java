package QuesEight.ProgramFive;
//编程题：
// 创建一个基类Person和一个子类Employee。
// Person有一个构造器，
// 接受一个名字参数。Employee有一个构造器，
// 接受一个名字和一个员工ID参数。
// 在Employee的构造器中调用Person的构造器，并讨论调用时机。
public class Main {
    public static void main(String[] args) {
        // 创建一个 Employee 对象
        Employee employee = new Employee("Alice", 101);

        // 输出 name 和 employeeId
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
