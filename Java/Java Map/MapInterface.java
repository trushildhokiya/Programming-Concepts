import java.util.HashMap;
import java.util.Map;

/*The Map interface of the Java collections framework provides the functionality of the map data structure.
 * In Java, elements of Map are stored in key/value pairs. Keys are unique values associated with individual Values.

A map cannot contain duplicate keys. And, each key is associated with a single value.

Working of the map interface in Java

We can access and modify values using the keys associated with them.
Since Map is an interface, we cannot create objects from it.

In order to use functionalities of the Map interface, we can use these classes:

HashMap
EnumMap
LinkedHashMap
WeakHashMap
TreeMap
These classes are defined in the collections framework and implement the Map interface.

The Map interface is also extended by these subinterfaces:

SortedMap
NavigableMap
ConcurrentMap

 */
//Example of map interface
public class MapInterface {
    public static void main(String[] args) {

        //creating map structure
        Map<Integer,String> days = new HashMap<>();

        days.put(0, "Sunday");
        days.put(1,"Monday");
        days.put(2,"Tuesday");
        days.put(3,"Wednesday");
        days.put(4,"Thursday");
        days.put(5,"Friday");
        days.put(6,"Saturday");

        System.out.println(days);
        System.out.println("Keys: "+days.keySet());
        System.out.println("Values: "+days.values());
        System.out.println("days: "+ days.entrySet());
    }    
}
