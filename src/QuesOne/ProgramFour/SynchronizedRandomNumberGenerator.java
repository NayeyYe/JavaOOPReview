package QuesOne.ProgramFour;
import java.util.Random;
public class SynchronizedRandomNumberGenerator {
    // 定义一个同步方法
    public synchronized void generateAndPrintRandomNumber() {
        // 生成一个随机数
        Random random = new Random();
        int randomNumber = random.nextInt(100); // 生成 0 到 99 之间的随机数

        // 打印随机数
        System.out.println("线程 " + Thread.currentThread().getName() + " 生成的随机数是: " + randomNumber);
    }
}