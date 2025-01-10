package QuesEleven.ProgramFive;
//编程题：
// 创建一个基类Person和一个子类Student。
// Person类有一个接受名字的构造方法。
// 在Student类中提供一个构造方法，
// 它除了接受名字外还接受一个学号，
// 并在Student的构造方法中调用Person的构造方法。
public class Main {
    public static void main(String[] args) {
        // 创建 Student 对象
        Student student = new Student("Alice", 12345);

        // 输出 name 和 studentId
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
    }
}
