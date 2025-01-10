package QuesOne.Volatile;

public class VolatileExample {
    public static void main(String[] args) throws InterruptedException {
        VolatileCounter example = new VolatileCounter();

        // 创建多个线程操作计数器
        Runnable classTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    VolatileCounter.incrementClassCounter();
                }
            }
        };

        Runnable instanceTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    example.incrementInstanceCounter();
                }
            }
        };

        // 线程构造器
        Thread thread1 = new Thread(classTask, "ClassThread-1");
        Thread thread2 = new Thread(classTask, "ClassThread-2");
        Thread thread3 = new Thread(instanceTask, "InstanceThread-1");
        Thread thread4 = new Thread(instanceTask, "InstanceThread-2");

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // 等待所有线程执行完毕
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        // 输出结果
        System.out.println("Final Class Counter：" + VolatileCounter.getClassCounter());
        System.out.println("Final Instance Counter：" + example.getInstanceCounter());

    }

}
