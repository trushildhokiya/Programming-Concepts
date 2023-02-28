import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQUEUE {
    public static void main(String[] args) {
        
        //creating a priority queue:
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        //Inserting elements in the pQueue
        /*
         *  add() - Inserts the specified element to the queue. If the queue is full, it throws an exception.
            offer() - Inserts the specified element to the queue. If the queue is full, it returns false.
         */

         queue.add(100);
         queue.offer(125);
         queue.add(1);
         queue.offer(10);
         
        System.out.println(queue);

        //accessing head element fron pQueue

        System.out.println("head of priority queue is pointing to: "+queue.peek());

        //removing element from pQueue
        /*
         * remove() - removes the specified element from the queue
            poll() - returns and removes the head of the queue
         */

         queue.remove(1);
         queue.poll();
         System.out.println(queue);

         //adding sample items in queue:
         queue.add(45);
         queue.add(7);
         queue.add(-12);
         
         //Iterating over a priority queue
         Iterator<Integer> iterator1 = queue.iterator();
         while(iterator1.hasNext()){
            System.out.print(iterator1.next()+ "\t");
         }
         System.out.println();
         /*
          * In all the examples above, priority queue elements are retrieved in the natural order 
          (ascending order). However, we can customize this ordering.

            For this, we need to create our own comparator class that implements the 
            Comparator interface. 
          */

          PriorityQueue<Integer> queue2 = new PriorityQueue<>(new CustomComparator());

          queue2.add(-10);
          queue2.add(-5);
          queue2.add(0);
          queue2.add(10);
          queue2.add(20);

          System.out.println("Queue with custom Comparator: "+queue2);

    }    
}

class CustomComparator implements Comparator<Integer>{
    
    @Override
    public int compare(Integer num1  , Integer num2){
        int value= num1.compareTo(num2);

        if(value>0){
            return -1 ;
        }
        if(value==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}