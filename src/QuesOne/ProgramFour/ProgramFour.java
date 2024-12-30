package QuesOne.ProgramFour;
//实现一个Java类，
// 使用synchronized关键字同步一个方法，
// 该方法内部生成一个随机数并打印。
public class ProgramFour {
    public static void main(String[] args) {
        // 创建 SynchronizedRandomNumberGenerator 的实例
        SynchronizedRandomNumberGenerator generator = new SynchronizedRandomNumberGenerator();

        // 创建多个线程来调用同步方法
        Runnable task = () -> {
            generator.generateAndPrintRandomNumber();
        };

        // 创建并启动多个线程
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
