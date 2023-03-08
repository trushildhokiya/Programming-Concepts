import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        
        //creating HashSet()
        HashSet<Integer> data = new HashSet<>();

        //adding data
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(9);
        data.add(8);
        data.add(7);

        /*Can also use addAll() */

        //accessing elements using iterator
        Iterator<Integer> iterator = data.iterator();
        
        while( iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //deleting data
        data.remove(1);
        System.out.println(data);

        /*Creating dummy set for Operations on HashSet data */
        HashSet<Integer> data1 = new HashSet<>();
        data1.add(10);
        data1.add(12);
        data1.add(2);
        data1.add(3);
        data1.add(5);
        //Opertions on HashSet
        //Union

        data.addAll(data1);
        System.out.println(data);

        //Intersection

        data.retainAll(data1);
        System.out.println(data);

        //Difference
        data.removeAll(data1);
        System.out.println(data);

        //subset
        System.out.println(data.containsAll(data1)); 


    }
}
