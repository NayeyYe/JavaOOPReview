package EX1.PrintNum;

public class PrintThread implements Runnable {
    private final int targetNumber;
    private static final Object lock = new Object();
    private static int state = 1;
    public PrintThread(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    @Override
    public void run(){
        while (true){
            synchronized (lock){
                try{
                    while(state != targetNumber){
                        lock.wait();
                    }
                    System.out.print(targetNumber);
                    state = (state % 4 ) + 1;
                    lock.notifyAll();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
