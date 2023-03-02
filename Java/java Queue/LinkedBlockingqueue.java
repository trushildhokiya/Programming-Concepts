import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingqueue {
    public static void main(String[] args) {
     
        //creating linkedBlocingQueue
        LinkedBlockingQueue<Integer> numbers = new LinkedBlockingQueue<>(10);

        //adding elements in linkedBlocingQueue

        //using add()
        numbers.add(10);
        numbers.add(20);

        //using offer()
        numbers.offer(30);
        numbers.offer(40);

        System.out.println("Numbers in list are: "+numbers);

        //accessing elements in linked blocking Queue:
        //using peek()
        System.out.println("Peeking in list: "+numbers.peek());

        //using iterator
        Iterator<Integer> listIterator = numbers.iterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()+' ');
        }
        System.out.println();

        //removing elemens in linked Blocking Queue
        //using remove()
        numbers.remove();
        System.out.println(numbers);
        
        //using poll()
        numbers.poll();
        System.out.println(numbers);

        //using clear()
        numbers.clear();
        System.out.println(numbers);

        //put method()
        try{
            numbers.put(10);
            numbers.put(20);
            numbers.put(30);
            System.out.println(numbers);
        }
        catch(InterruptedException e){
            e.getMessage();
        }

        //take method()
        try{
            numbers.take();
            System.out.println(numbers);
        }
        catch(InterruptedException e){
            e.getMessage();
        }
    }
}
