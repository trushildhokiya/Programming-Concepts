import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmap {
    public static void main(String[] args) {
        
        //creating concurrent hash map
        ConcurrentHashMap<Integer,String> data = new ConcurrentHashMap<>();

        //inserting into map
        data.put(1, "Pizza");
        data.put(2, "sandwich");
        data.put(3, "Ice-cream");
        data.putIfAbsent(2, "Pizza");
        System.out.println(data);

        //accessing elel=ments 
        System.out.println("Entries: "+data.entrySet());
        System.out.println("Keys: "+data.keySet());
        System.out.println("Values: "+data.values());

        //using get() or getOrDefault()
        System.out.println(data.get(2));
        System.out.println(data.getOrDefault(5, "Not in map"));

        //removing elements
        data.remove(2);
        data.remove(1,"Ramen");

        System.out.println(data.entrySet());

        /*adding some more data in map */
        data.put(2, "Sandwich");
        data.put(4, "Ramen");

        //bulk Operations on map
        //1. forEach()
        /*
         * The forEach() method iterates over our entries and executes the specified function.

            It includes two parameters.

            parallelismThreshold - It specifies that after how many elements operations in a map are executed in parallel.
            transformer - This will transform the data before the data is passed to the specified function.
         */
        data.forEach(4,(key,value)->System.out.println(key+","+value)); //without transformer function
        data.forEach(4,(key,value)->value,(value)->System.out.print(value+",\t"));
        System.out.println();

        //2. using search method
        /*
         * The search() method searches the map based on the specified function and returns the matched entry.

            Here, the specified function determines what entry is to be searched.

            It also includes an optional parameter parallelThreshold. The parallel threshold specifies that after how many elements in the map the operation is executed in parallel.
         */
        String result = data.search(4, (k,v)->{return v.equals("Ramen") ?"Naruto Uzumaki" : null;});
        System.out.println(result);

        //reduce()
        /*
         * The reduce() method accumulates (gather together) each entry in a map. This can be used when we need all the entries to perform a common task, like adding all the values of a map.

        It includes two parameters.

        parallelismThreshold - It specifies that after how many elements, operations in a map are executed in parallel.
        transformer - This will transform the data before the data is passed to the specified function.
         */
        int sum = data.reduce(4, (key,value)->key, (key1 , key2)-> key1 + key2);
        System.out.println(sum);
    }
}

//some advantages
/*
 The ConcurrentHashMap class allows multiple threads to access its entries concurrently.
By default, the concurrent hashmap is divided into 16 segments. This is the reason why 16 threads are allowed to concurrently modify the map at the same time. However, any number of threads can access the map at a time.
The putIfAbsent() method will not override the entry in the map if the specified key already exists.
It provides its own synchronization.
 */