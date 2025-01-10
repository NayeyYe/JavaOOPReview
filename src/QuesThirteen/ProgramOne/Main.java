package QuesThirteen.ProgramOne;
//编程题：
// 创建两个线程，
// 一个生产者线程和一个消费者线程，
// 使用一个共享资源（如一个整数）。
// 生产者线程增加共享资源的值，
// 消费者线程减少它的值。
// 确保线程间正确通信，避免数据不一致。
public class Main {
    public static void main(String[] args) {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        consumer.start();
    }
}
