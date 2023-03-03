import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> data = new LinkedHashMap<>();

        //add elements using put() , putAll() , putIfAbsent()
        data.put(1, "Tokyo");
        data.put(2, "NewYork");
        data.put(3, "Los Angeles");

        data.putIfAbsent(3, "NewYork");

        System.out.println(data);

        //accessing data using entrySet(), keySet(), values()
        System.out.println("Entries: "+data.entrySet());
        System.out.println("Keys: "+data.keySet());
        System.out.println("Values: "+data.values());

        //accessing using get() or getOrDefault()
        System.out.println(data.get(2));
        System.out.println(data.getOrDefault(7, null));
        //removing elements

        data.remove(1);
        data.remove(2,"NewYork");
        System.out.println(data);
    }
}

/*
 * Both the LinkedHashMap and the HashMap implements the Map interface. However, there exist some differences between them.

LinkedHashMap maintains a doubly-linked list internally. Due to this, it maintains the insertion order of its elements.
The LinkedHashMap class requires more storage than HashMap. This is because LinkedHashMap maintains linked lists internally.
The performance of LinkedHashMap is slower than HashMap.
 */