package QuesThirteen.ProgramThree;

public class Main {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int taskId = i;
            threadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " is executing Task " + taskId);
                try {
                    Thread.sleep(1000); // 模拟任务执行时间
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // 等待所有任务完成
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        threadPool.shutdown();
    }
}
