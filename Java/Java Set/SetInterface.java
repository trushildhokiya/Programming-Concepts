import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        
        //creating sets
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //some methods of set
        //add()
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        System.out.println(set1);
        
        //remove()
        set1.remove(6);
        System.out.println(set1);

        //size()
        System.out.println(set1.size());

        //toArray()
        System.out.println(Arrays.toString(set1.toArray()));

        //contains
        System.out.println(set1.contains("set2"));

        //hashcode()
        System.out.println(set1.hashCode());


        /* Adding data to set2 */
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        //Operattions of set
        //1.Union

        set1.addAll(set2);
        System.out.println(set1);

        //2.Intersections
        
        set1.retainAll(set2);
        System.out.println(set1);

        //subset
        System.out.println(set1.containsAll(set2));
    }    
}
