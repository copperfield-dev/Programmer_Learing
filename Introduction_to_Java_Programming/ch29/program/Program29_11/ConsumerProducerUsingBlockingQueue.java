import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by copperfield on 23/11/2016.
 */
public class ConsumerProducerUsingBlockingQueue {
    private static ArrayBlockingQueue<Integer> buffer =
        new ArrayBlockingQueue<Integer>(2);
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new ProducerTask());
        executor.execute(new ConsumerTask());
        executor.shutdown();
    }
    
    private static class ProducerTask implements Runnable {
        public void run() {
            try {
                int i = 1;
                while (true) {
                    System.out.println("Producer writes " + i);
                    buffer.put(i++);
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static class ConsumerTask implements Runnable {
        public void run() {
            try {
                while (true) {
                    System.out.println("\t\t\tConsumer reads " + buffer.take());
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
