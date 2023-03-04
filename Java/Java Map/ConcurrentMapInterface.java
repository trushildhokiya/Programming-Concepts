import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/*
 The ConcurrentMap interface of the Java collections framework provides a thread-safe map. That is, multiple threads can access the map at once without affecting the consistency of entries in a map.
ConcurrentMap is known as a synchronized map.
It extends the Map interface.
 */
public class ConcurrentMapInterface {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> data = new ConcurrentHashMap<>();

        data.put(1, "Cricket");
        data.put(2, "Hockey");
        data.put(3, "football");

        System.out.println(data);

        System.out.println("Accessed data: "+data.get(2));

        //removing elements
        data.remove(1);
        System.out.println(data.entrySet());
    }
}
