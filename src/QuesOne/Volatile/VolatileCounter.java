package QuesOne.Volatile;

public class VolatileCounter {
    // volatile 类变量
    private static volatile int classCounter = 0;

    // volatile实例变量
    private volatile int instanceCounter = 0;

    // 线程安全的计数器方法(属于类本身)
    public static synchronized void incrementClassCounter() {
        classCounter++;
    }

    // 线程安全计数器方法(属于实例对象)
    public synchronized void incrementInstanceCounter() {
        instanceCounter++;
    }

    // 获取类计数器的值
    public static int getClassCounter() {
        return classCounter;
    }

    // 获取实例计数器的值
    public int getInstanceCounter() {
        return instanceCounter;
    }
}
