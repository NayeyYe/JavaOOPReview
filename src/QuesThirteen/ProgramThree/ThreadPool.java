package QuesThirteen.ProgramThree;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {
    public final BlockingQueue<Runnable> taskQueue;
    public final Thread[] workerThreads;

    public ThreadPool(int poolSize) {
        this.taskQueue = new LinkedBlockingQueue<>();
        this.workerThreads = new Thread[poolSize];

        for (int i = 0; i < poolSize; i++) {
            workerThreads[i] = new Worker("Worker-" + i);
            workerThreads[i].start();
        }
    }

    public void submit(Runnable task) {
        try{
            taskQueue.put(task);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public void shutdown() {
        for (Thread thread : workerThreads) {
            thread.interrupt();
        }
    }

    private class Worker extends Thread {
        public Worker(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                try{
                    Runnable task = taskQueue.take();
                    task.run();
                }catch (InterruptedException e ){
                    interrupt();
                }
            }
        }
    }
}
