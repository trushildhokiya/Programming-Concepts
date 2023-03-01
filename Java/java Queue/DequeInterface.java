import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {
        
        Deque<String> deque = new ArrayDeque<>();

        //Methode of deque

        //1. add First:
        deque.addFirst("Monkey");
        System.out.println("After using add First: "+deque);

        //2.addLast()
        deque.addLast("Donkey");
        System.out.println("After using addLast(): "+deque);

        //3.offerfirst()
        deque.offerFirst("Rhinosaureaus");
        System.out.println("After using offerFirst(): "+deque);

        //4.offerLast()
        deque.offerLast("Lion");
        System.out.println("After using offerLast(): "+deque);

        //5.getFirst()
        System.out.println("First element in deque is: "+deque.getFirst());

        //6.getLast()
        System.out.println("Last element in deque is: "+deque.getLast());

        //7.peekFirst()
        System.out.println("Peeking first element in deque: "+deque.peekFirst());

        //8.peekLast()
        System.out.println("Peeking last element in deque: "+deque.peekLast());

        //9.removeFirst()
        System.out.println("Removed first element from deque: "+deque.removeFirst());
        System.out.println(deque);

        //10.removeLast()
        System.out.println("Removed last element from deque: "+deque.removeLast());
        System.out.println(deque);

        //11. pollFirst()
        System.out.println("Removed first element from deque: "+deque.pollFirst());
        System.out.println(deque);

        //12.pollLast():
        System.out.println("Removed last element from deque: "+deque.pollLast());
        System.out.println(deque);

    }
}
