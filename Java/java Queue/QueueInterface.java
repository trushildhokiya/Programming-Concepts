import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface{
    public static void main(String[] args) {
        
        /*In order to use the functionalities of Queue, we need to use classes that implement it:

        ArrayDeque
        LinkedList
        PriorityQueue */
        Queue<Integer> list1 = new LinkedList<>();
        
        //methods of Queue Interface

        //add method
        list1.add(12);

        //offer method
        list1.offer(16);
        list1.offer(18);
        list1.offer(20);

        //Pprint list

        System.out.println(list1);
        //element methdd:
        System.out.println(list1.element());

        //peek method
        System.out.println(list1.peek());

        //remove method
        System.out.println("removed: "+ list1.remove());

        //poll method
        System.out.println("Removed element by poll method: "+ list1.poll());
    }
}