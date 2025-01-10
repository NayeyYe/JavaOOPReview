package QuesOne.Synchronized;
// 以下是一个Java类，
// 其中包含一个使用`synchronized`关键字同步的方法。
// 该方法生成一个随机数并打印。
public class SynchronizedTest {
    public static void main(String[] args) {
        SynchronizedRandomNumberPrinter printer = new SynchronizedRandomNumberPrinter();

        // 创建多个线程调用同步方法
        Runnable tesk = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    printer.printRandomNumber();
                    try{
                        Thread.sleep(100); // 模拟耗时操作
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread1 = new Thread(tesk, "Thread-1");
        Thread thread2 = new Thread(tesk, "Thread-2");
        Thread thread3 = new Thread(tesk, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
