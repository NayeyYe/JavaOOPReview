package QuesThirteen.ProgramOne;

public class Consumer extends ProducerConsumer implements Runnable {
    @Override
    public void run() {
        while(true){
            synchronized(lock){
                while(sharedResource == 0){
                    try{
                        lock.wait();// 等待生产者生产
                    }catch(InterruptedException e){
                        Thread.currentThread().interrupt();
                    }
                }
                sharedResource--;
                System.out.println("Consumed: " + sharedResource);
                lock.notify();// 通知生产者
            }
            try{
                Thread.sleep(500);// 模拟消费时间
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }

}
