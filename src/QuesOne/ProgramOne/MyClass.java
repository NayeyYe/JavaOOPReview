package QuesOne.ProgramOne;

public class MyClass {
    // private整数成员变量
    private int myVar;

    // public 构造器，初始化变量
    public MyClass(int initialValue) {
        this.myVar = initialValue;
    }

    // protected 方法，返回变量值
    protected int getMyVar() {
        return this.myVar;
    }
}
