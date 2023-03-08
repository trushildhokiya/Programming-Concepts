import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {
        
        //creating sortedset 
        SortedSet<Integer> data = new TreeSet<>();
    
        //adding data
        data.add(1);
        data.add(11);
        data.add(123);
        data.add(21);
        data.add(89);
        data.add(13);
        System.out.println(data);
        
        //some methods of sorted set interface
        //1. first()
        System.out.println(data.first());

        //2.last()
        System.out.println(data.last());

        //3.headSet()
        System.out.println(data.headSet(21));

        //4.tailSet()
        System.out.println(data.tailSet(13));

        //5.subSet()
        System.out.println(data.subSet(11, 90));
    }    
}
