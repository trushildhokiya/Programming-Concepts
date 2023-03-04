import java.util.SortedMap;
import java.util.TreeMap;
/*
 The SortedMap interface of the Java collections framework provides sorting of keys stored in a map.

It extends the Map interface.
 */
public class SortedmapInterface {
    public static void main(String[] args) {
        
        SortedMap<Integer,String> data = new TreeMap<>();

        //add data in SortedMap inteface
        data.put(10, "China");
        data.put(1, "India");
        data.put(2, "Russia");
        data.put(7, "USA");
        data.put(4, "Japan");

        System.out.println(data);


        //few methods of SortedMap Inteface
        //1.firstKey()
        System.out.println("First key in data is: "+data.firstKey());

        //2.lastkey()
        System.out.println("Last key in data is: "+data.lastKey());
        
        //3.headMap
        System.out.println(data.headMap(5));

        //4.tailMap
        System.out.println(data.tailMap(6));

        //5.subMap()
        System.out.println(data.subMap(3, 7));
    }
}