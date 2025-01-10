package QuesEleven.ProgramFive;

public class Student extends Person {
    private int studentId;

    // 构造方法：接受名字和学号参数
    public Student(String name, int studentId) {
        // 调用父类 Person 的构造方法
        super(name);
        this.studentId = studentId;
        System.out.println("Student 构造方法被调用，studentId: " + this.studentId);
    }

    // 获取 studentId
    public int getStudentId() {
        return studentId;
    }
}
