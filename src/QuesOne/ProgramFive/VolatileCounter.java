package QuesOne.ProgramFive;

public class VolatileCounter {
    private static volatile int classCounter = 0;

    // 使用 volatile 修饰的实例变量
    private volatile int instanceCounter = 0;

    // 线程安全的计数器方法（同步方法）
    public synchronized void incrementCounters() {
        // 增加类变量的值
        classCounter++;
        // 增加实例变量的值
        instanceCounter++;
    }

    // 打印计数器值的方法
    public void printCounters() {
        System.out.println("类变量 classCounter: " + classCounter);
        System.out.println("实例变量 instanceCounter: " + instanceCounter);
    }
}
