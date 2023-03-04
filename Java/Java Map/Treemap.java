import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        //creating tree map
        TreeMap<Integer,String> data = new TreeMap<>();

        //insert elements in map
        data.put(1, "Andrew");
        data.put(2, "Josh");
        data.putIfAbsent(3, "King");

        System.out.println(data);

        //access elements
        System.out.println("Entries: "+data.entrySet());
        System.out.println("Keys: "+data.keySet());
        System.out.println("Values: "+data.values());

        //using get() and getOrDefault()
        System.out.println(data.get(1));
        System.out.println(data.getOrDefault(5, "Absent Entry"));

        //removing elements
        data.remove(2);
        data.remove(2,"John");
        System.out.println(data);

        //replacing elements
        data.replace(1, "Andrew", "Kingston");
        data.replaceAll((key,value)-> value.toUpperCase());
        System.out.println(data);

        //methods for Navigation:
        //1. first and last methods
        System.out.println("first key: "+data.firstKey());
        System.out.println("first entry: "+data.firstEntry());
        System.out.println("last key: "+data.lastKey());
        System.out.println("last entry: "+data.lastEntry());

        /*addding some data in map  */
        data.put(2, "Andrew");
        data.put(4, "Ivan");
        data.put(10, "Hernandez");
        data.put(7, "nathan");

        //2. cieling , floor , higher , lower methods
        System.out.println("output : "+data.higherKey(4));
        System.out.println("output : "+data.higherEntry(6));
        System.out.println("output : "+data.lowerKey(3));
        System.out.println("output : "+data.lowerEntry(4));
        System.out.println("output : "+data.ceilingKey(2));
        System.out.println("output : "+data.ceilingEntry(2));
        System.out.println("output : "+data.floorKey(4));
        System.out.println("output : "+data.floorEntry(5));

        //3. pollfirstEntry() pollLastEntry()
        System.out.println("Removed element: "+data.pollFirstEntry());
        System.out.println("Removed element: "+data.pollLastEntry());

        //4. headMap() , tailMap() , subMap()
        System.out.println(data.headMap(4));
        System.out.println(data.tailMap(4));
        System.out.println(data.subMap(4, 9));

        System.out.println(data.descendingMap()); // for printing in descending order
        //by default it is set to ascending
    }
}
