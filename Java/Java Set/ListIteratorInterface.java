import java.util.ArrayList;
import java.util.ListIterator;

/*
 The ListIterator interface of the Java collections framework provides the functionality to access elements of a list.
It is bidirectional. This means it allows us to iterate elements of a list in both the direction.
It extends the Iterator interface.

 */
public class ListIteratorInterface {
    public static void main(String[] args) {
        
        //creating arrayList
        ArrayList<Integer> data = new ArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);
        data.add(60);
        data.add(70);

        //Iterator List
        ListIterator<Integer> iterator = data.listIterator();

        System.out.println(iterator.next());
        System.out.println("Next element is at index: "+iterator.nextIndex());
        System.out.println("Does list has next more items? : "+iterator.hasNext());


        //traversing backward
        System.out.println("Previous index: "+iterator.previousIndex());
        System.out.println(iterator.previous());

        iterator.set(12);
        System.out.println(data);
        System.out.println(iterator.next());
        
    }    
}
