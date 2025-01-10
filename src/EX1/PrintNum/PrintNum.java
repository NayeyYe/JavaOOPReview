package EX1.PrintNum;

public class PrintNum {

    public static void main(String[] args) {
        // 创建四个线程
        Thread thread1 = new Thread(new PrintThread(1));
        Thread thread2 = new Thread(new PrintThread(2));
        Thread thread3 = new Thread(new PrintThread(3));
        Thread thread4 = new Thread(new PrintThread(4));

        // 启动线程
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
