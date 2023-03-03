import java.util.WeakHashMap;

/*
 The WeakHashMap class of the Java collections framework provides the feature of the hash table data structure..

It implements the Map interface.

Java WeakHashMap implements the Map interface.

Note: Keys of the weak hashmap are of the WeakReference type.

The object of a weak reference type can be garbage collected in Java if the reference is no longer used in the program.
 */
public class WeakHashmap {
    public static void main(String[] args) {
        
        //creating weak hashmap
        WeakHashMap<String, Integer> data = new WeakHashMap<>();

        //imp feature of weak hash map
        Integer num1 = 1;
        Integer num2 = 2;
        String s1 = new String("Tokyo");
        String s2 = new String("NewYork");

        data.put(s1, num1);
        data.put(s2, num2);

        System.out.println(data);

        s1=null;

        //calling the garbage collector
        System.gc();

        System.out.println(data);
        //clearing data
        data.clear();

        //adding data in weak hash maps
        data.put("Tokyo",1);
        data.put("Ohio",2);
        data.put("Banglore",3);
        data.put("Mumbai",4);

        System.out.println(data);


        // accessing data
        System.out.println(data.entrySet());
        System.out.println(data.keySet());
        System.out.println(data.values());

        //get() getOrDefault()
        System.out.println(data.get("Mumbai"));
        System.out.println(data.getOrDefault("London", null));

        //removing data
        data.remove("Mumbai");
        data.remove("Tokyo",1);
        System.out.println(data);
    }
}
