package QuesOne.ProgramOne;

//编写一个Java类，
// 包含一个private整数成员变量和一个public构造器，
// 该构造器初始化变量，
// 并提供一个protected方法来返回这个变量的值。
public class ProgramOne
{
    private int num;
    public ProgramOne(int num)
    {
        this.num = num;
    }
    protected int getNum()
    {
        return num;
    }

    public static void main(String[] args) {
        ProgramOne programOne = new ProgramOne(5);
        System.out.println(programOne.getNum());
    }
}
