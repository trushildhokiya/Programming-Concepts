import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Blockingqueue {
    public static void main(String[] args) throws InterruptedException {
        
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        //adding values to Blocking Quue:
        queue.add("Asia");
        queue.add("North America");
        System.out.println(queue);
        
        /*
         * The offer() and poll() method can be used with timeouts. That is, we can pass time units as a parameter. 
         */
        queue.offer("Australia",1,TimeUnit.SECONDS);
       

        Thread.sleep(1000);
        System.out.println(queue);

        /*
        he BlockingQueue also provides methods to block the operations and wait if the queue is full or empty.

        put() - Inserts an element to the blocking queue. If the queue is full, it will wait until the queue has space to insert an element.
        take() - Removes and returns an element from the blocking queue. If the queue is empty, it will wait until the queue has elements to be deleted.
        Suppose, we want to insert elements into a queue. If the queue is full then the put() method will wait until the queue has space to insert elements.

        Similarly, if we want to delete elements from a queue. If the queue is empty then the take() method will wait until the queue contains elements to be deleted.
        */


        queue.remove();
        queue.put("Europe");
        System.out.println(queue);
        

    }
}