import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * The NavigableSet is considered as a type of SortedSet. It is because NavigableSet extends the SortedSet interface.

Hence, all SortedSet methods are also available in NavigableSet. To learn how these methods, visit Java SortedSet.

However, some of the methods of SortedSet (headSet(), tailSet() and subSet()) are defined differently in NavigableSet.
 */
public class Navigableset {
    public static void main(String[] args) {
        
        //creating navigable set
        NavigableSet<Integer> data = new TreeSet<>();

        /*adding data in set */
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(50);
        data.add(60);

        //methods of navigable set;

        //1.headSet()
        System.out.println(data.headSet(40,true));

        //2. tailSet()
        System.out.println(data.tailSet(40,false));

        //3.subSet()
        System.out.println(data.subSet(20,false,50,true));

        //4. descendingSet()
        System.out.println(data.descendingSet());
        
    }
}

