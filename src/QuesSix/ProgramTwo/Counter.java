package QuesSix.ProgramTwo;

public class Counter {
    // 实例变量
    private int count;

    // 类变量
    private static int total;

    // 构造器
    public Counter() {
        this.count = 0;
    }

    // 增加count和total的值
    public void increment() {
        this.count++;
        total++;
    }

    // 获取count的值
    public int getCount() {
        return count;
    }

    // 获取total的值
    public static int getTotal() {
        return total;
    }
}
