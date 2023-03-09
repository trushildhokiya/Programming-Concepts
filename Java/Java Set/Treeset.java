import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        
        //creating tree set 
        TreeSet<Integer> data = new TreeSet<>();

        //Methods in TreeSet 
        //adding elememts
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);

        //acccessing elements
        Iterator<Integer> iterator = data.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //removing elements
        data.remove(30);
        System.out.println(data);

        /*adding few elements  */
        data.add(30);
        data.add(60);
        //Methods for Navigation

        //last() and first()
        System.out.println("First element in data is: "+data.first());
        System.out.println("Last element in data is: "+data.last());

        // higher() lower() floor() cieling()
        /*
         * higher(element) - Returns the lowest element among those elements that are greater than the specified element.
            lower(element) - Returns the greatest element among those elements that are less than the specified element.
            ceiling(element) - Returns the lowest element among those elements that are greater than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
            floor(element) - Returns the greatest element among those elements that are less than the specified element. If the element passed exists in a tree set, it returns the element passed as an argument.
         */
        System.out.println("Using higher(): "+data.higher(30));
        System.out.println("Using Lower(): "+data.lower(40));
        System.out.println("Using cieling(): "+data.ceiling(30));
        System.out.println("Using floor(): "+data.floor(40));

        //pollFirst() and pollLast()
        data.pollFirst();
        System.out.println(data);

        data.pollLast();
        System.out.println(data);

        //headSet() tailSet() SubSet()

        System.out.println(data.headSet(20,true));

        System.out.println(data.tailSet(30,true));

        System.out.println(data.subSet(10,false,30,true));

        //Set Operations

        /*creating other set */
        TreeSet<Integer> data2 = new TreeSet<>();
        data2.add(30);
        data2.add(40);
        data2.add(100);

        //Union
        data.addAll(data2);
        System.out.println(data);

        //Intersection
        data.retainAll(data2);
        System.out.println(data);

        //Difference
        data.removeAll(data2);
        System.out.println(data);

        //Subset
        System.out.println(data.containsAll(data2));

    }
}
