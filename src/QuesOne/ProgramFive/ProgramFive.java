package QuesOne.ProgramFive;

public class ProgramFive {
    public static void main(String[] args) {
        // 创建 VolatileCounter 的实例
        VolatileCounter counter = new VolatileCounter();

        // 创建多个线程来调用计数器方法
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementCounters();
            }
        };

        // 创建并启动多个线程
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        // 等待所有线程完成
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印最终的计数器值
        counter.printCounters();
    }

}
