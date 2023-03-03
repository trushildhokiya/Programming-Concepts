import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.transform.Source;

public class Hashmap {
    public static void main(String[] args) {
        
        //creating hashmap
        HashMap<String, String> data = new HashMap<>();

        //adding data using put(key, value);

        data.put("India", "New Delhi");
        data.put("Russia","Moscow");
        data.put("USA","Washington D.C");
        System.out.println(data.entrySet());

        //accessing elements in hash map:
        //get()
        System.out.println("Data at index 1: "+data.get(1));

        //.keySet()
        System.out.println("Keys: "+data.keySet());

        //.values()
        System.out.println("Values: "+data.values());

        //.entrySet()
        System.out.println("Data: "+data.entrySet());

        //replacing values using replace()
        data.replace("Russia", "Moscow", "MOSCOW");
        System.out.println(data.entrySet());

        //removing elements from hashmap
        data.remove("USA");
        System.out.println(data.entrySet());

        //Some methods of HashMap
        //1.clear()
        //data.clear()  //clears all entries in Hashmap

        //2. compute()
        String data1 = data.compute("Russia", (key,value)-> value.toLowerCase());
        System.out.println(data1);
        System.out.println("New Hash Map: "+data.entrySet());

        //3. containsKey()
        System.out.println("Data contains India: "+data.containsKey("India"));

        //4. containsValue()

        System.out.println("Data contains Kathmandu: "+data.containsValue("Kathmandu"));

        //iterate through hashmaps

        //only keys
        for(String keys : data.keySet()){
            System.out.print(keys+"\t");
        }
        System.out.println();

        //only values 
        for( String values : data.values()){
            System.out.print(values+"\t");
        }
        System.out.println();

        //whole data set(keys + values)
        for(Entry<String, String> set : data.entrySet()){
            System.out.print(set+"\t");
        }
        System.out.println();


        /*
         *  While creating a hashmap, we can include optional parameters: capacity and load factor. For example,

            HashMap<K, V> numbers = new HashMap<>(8, 0.6f);
            Here,

            8 (capacity is 8) - This means it can store 8 entries.
            0.6f (load factor is 0.6) - This means whenever our hash table is filled by 60%, the entries are moved to a new hash table double the size of the original hash table.
            If the optional parameters not used, then the default capacity will be 16 and the default load factor will be 0.75.
         */
    }
}