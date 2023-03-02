import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingqueue {
    public static void main(String[] args) {
        
        //creating array blocing queue:
        ArrayBlockingQueue<String> countries = new ArrayBlockingQueue<>(5);

        //Methods of arrayBlocing Queue:
        //Adding elements in queue using ( add() , offer() )
        countries.add("India");
        countries.add("Russia");
        countries.offer("United States of America");

        System.out.println(countries);

        //Accessing elements of queue using (peek() , using iterator)
        System.out.println("Peeking into queue: "+countries.peek());

        Iterator<String> queueIterator = countries.iterator();
        while(queueIterator.hasNext()){
            System.out.print(queueIterator.next()+" ");
        }
        System.out.println();

        //removing elements from queue using ( remove() , poll() , clear() )
        countries.remove();
        System.out.println(countries);

        countries.poll();
        System.out.println(countries);

        countries.clear();
        System.out.println(countries);

        //put and take method
        //put()
        /*To add an element to the end of an array blocking queue, we can use the put() method.

        If the array blocking queue is full, it waits until there is space in the array blocking queue to add an element. */
        
        try{
            countries.put("India");
            countries.put("Russia");
            countries.put("Nepal");
            System.out.println(countries);
        }
        catch(InterruptedException e){
            e.getMessage();
        }


        //take() method
        /*To return and remove an element from the front of the array blocking queue, we can use the take() method.

        If the array blocking queue is empty, it waits until there are elements in the array blocking queue to be deleted. */
        try{
            System.out.println("Removed country from queue: "+countries.take());
            System.out.println(countries);
        }
        catch(InterruptedException e){
            e.getMessage();
        }
    }
}
