import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String[] args) {
        
        //creating linkedHashSet()

        //creating using LinkedHashSet class in java.util
        LinkedHashSet<Integer> data1 = new LinkedHashSet<>();

        //using other collections
        ArrayList<Integer> data2 = new ArrayList<>();
        data2.add(1);
        data2.add(5);
        data2.add(10);

        LinkedHashSet<Integer> data3 = new LinkedHashSet<>(data2);
        System.out.println(data3);

        //adding elements 
        data1.add(1);
        data1.add(3);
        data1.add(5);
        data1.add(10);
        data1.add(13);
        data1.add(19);

        System.out.println(data1);

        //iterating over elements
        Iterator<Integer> iterator = data1.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        //deleting elements
        data1.remove(19);
        System.out.println(data1);

        //Operations on LinkedHashSet
        
        //1. Union

        data1.addAll(data3);
        System.out.println(data1);

        //2. Intersection

        data1.retainAll(data3);
        System.out.println(data1);

        //3. Difference

        data1.removeAll(data3);
        System.out.println(data1);

        //4. Subset
        System.out.println(data1.containsAll(data3));
    }    
}
