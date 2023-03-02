import java.util.HashMap;

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


    }
}