package QuesThirteen.ProgramOne;

public class Producer extends ProducerConsumer implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (lock){
                while(sharedResource == MAX_RESOURCE){
                    try{
                        lock.wait();// 等待消费者消费
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                sharedResource++;
                System.out.println("Producer: " + sharedResource);
                lock.notify();// 通知消费者
            }
            try{
                Thread.sleep(100);// 模拟生产时间
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
