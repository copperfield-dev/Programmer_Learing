import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by copperfield on 21/11/2016.
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 50));
        executor.execute(new PrintNum(100));
        
        executor.shutdown();
    }
}
