package QuesOne.ProgramFour;

public class ThisClass {
    int value;
    public ThisClass(int value) {
        this.value = value;// 使用this区分实例变量和参数
    }

    public ThisClass() {
        this(0); // 使用this调用另一个构造器
    }

    public void display(){
        // 使用this访问实例变量
        System.out.println("Value：" + this.value);
    }
}
