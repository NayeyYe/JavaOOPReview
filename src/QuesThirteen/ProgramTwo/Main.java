package QuesThirteen.ProgramTwo;

public class Main {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");
                try {
                    Thread.sleep(100); // 模拟操作
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 1");
                try {
                    Thread.sleep(100); // 模拟操作
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}