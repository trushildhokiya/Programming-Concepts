import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterface {
    public static void main(String[] args) {
        
        //creating Navigable map using treeMap
        NavigableMap<Integer,String> data = new TreeMap<>();

        //adding data in map
        data.put(10, "Australia");
        data.put(8, "Italy");
        data.put(7, "Germany");
        data.put(5, "France");
        data.put(3, "Japan");
        data.put(2, "Russia");
        data.put(1, "India");

        System.out.println(data);

        //some methods of Navigabe map interface
        //1.headMap()

        System.out.println(data.headMap(5,true)); //boolean value signifies inclusive 

        //2.tailMap()
        System.out.println(data.tailMap(7,true));

        //3.subMap()
        System.out.println(data.subMap(3,true,7,false));

        //4.descendingMap()
        System.out.println(data.descendingMap());

        //5.descendingKeySet()
        System.out.println(data.descendingKeySet());
        
        //.. and manymore
        
    }
}
