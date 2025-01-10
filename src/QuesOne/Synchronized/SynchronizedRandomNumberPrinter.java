package QuesOne.Synchronized;

import java.util.Random;

public class SynchronizedRandomNumberPrinter {
    // 同步方法，生成并且打印随机数
    public synchronized void printRandomNumber() {
        Random random = new Random();
        // 生成0到99的随机数
        int randomNumber = random.nextInt(100);
        // 线程名字 + 线程生成的随机数
        System.out.println(Thread.currentThread().getName() + ": " + randomNumber);
    }
}
