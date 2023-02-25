import java.util.Iterator;
import java.util.Vector;

/*
 * In Java, both ArrayList and Vector implements the List interface and provides the same functionalities. However, there exist some differences between them.

The Vector class synchronizes each individual operation. This means whenever we want to perform some operation on vectors, the Vector class automatically applies a lock to that operation.

It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vectors less efficient.

However, in array lists, methods are not synchronized. Instead, it uses the Collections.synchronizedList() method that synchronizes the list as a whole.
 */
public class Vectors {
    public static void main(String[] args) {
        
        Vector <String> cities = new Vector<String>();
        Vector<String> duplicate_cities = new Vector<String>();

        //add elemts to vector
        cities.add("Mumbai");
        cities.add("Ahemdabad");
        cities.add(2,"London");

        duplicate_cities.addAll(cities);
        System.out.println("original"+cities);
        System.out.println("duplicate: "+duplicate_cities);

        //get elements from vector
        System.out.println(cities.get(1)+'\n');

        //printing all elements using iterator
        Iterator citiesIterator = cities.iterator();
        while(citiesIterator.hasNext()){
            System.out.println(citiesIterator.next());
        }

        //remove from vector
        duplicate_cities.remove(0);
        System.out.println(duplicate_cities);

        duplicate_cities.clear(); //clears arraylist
        System.out.println(duplicate_cities);

        //convert arraylist to string
        System.out.println(cities.toString());
    }
}
